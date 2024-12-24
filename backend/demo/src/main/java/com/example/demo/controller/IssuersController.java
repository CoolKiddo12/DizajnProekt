package com.example.demo.controller;

import com.example.demo.model.Issuers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.IssuersService;

import java.util.List;

@RestController
@RequestMapping("/api/issuers")
@Validated
@CrossOrigin(origins="*")
public class IssuersController {

    private final IssuersService issuersService;

    @Autowired
    public IssuersController(IssuersService issuersService) {
        this.issuersService = issuersService;
    }

    @GetMapping
    public ResponseEntity<List<Issuers>> getAllIssuers() {
        List<Issuers> issuers = issuersService.findAll();
        return new ResponseEntity<>(issuers, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Issuers> getIssuerById(@PathVariable Long id) {
        Issuers issuer = issuersService.findById(id);
        if (issuer != null) {
            return new ResponseEntity<>(issuer, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/symbol/{symbol}")
    public ResponseEntity<Issuers> getIssuerBySymbol(@PathVariable String symbol) {
        Issuers issuer = issuersService.findBySymbol(symbol);
        if (issuer != null) {
            return new ResponseEntity<>(issuer, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Void> addIssuer(@RequestBody Issuers issuer) {
        issuersService.save(issuer);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteIssuer(@PathVariable Long id) {
        issuersService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

