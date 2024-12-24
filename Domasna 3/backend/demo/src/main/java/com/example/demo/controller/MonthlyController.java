package com.example.demo.controller;

import com.example.demo.model.IndicatorMonthly;
import com.example.demo.service.MonthlyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/indicators/monthly")
public class MonthlyController {

    @Autowired
    private MonthlyService monthlyService;

    // Get all indicators
    @GetMapping
    public ResponseEntity<List<IndicatorMonthly>> getAllIndicators() {
        return ResponseEntity.ok(monthlyService.getAllIndicators());
    }

    // Get indicator by ID
    @GetMapping("/{id}")
    public ResponseEntity<IndicatorMonthly> getIndicatorById(@PathVariable Long id) {
        return ResponseEntity.ok(monthlyService.getIndicatorById(id));
    }

    // Get indicators by SYMBOL
    @GetMapping("/symbol/{symbol}")
    public ResponseEntity<List<IndicatorMonthly>> getIndicatorsBySymbol(@PathVariable String symbol) {
        return ResponseEntity.ok(monthlyService.getIndicatorsBySymbol(symbol));
    }

    // Get indicators by SIGNAL
    @GetMapping("/signal/{signal}")
    public ResponseEntity<List<IndicatorMonthly>> getIndicatorsBySignal(@PathVariable String signal) {
        return ResponseEntity.ok(monthlyService.getIndicatorsBySignal(signal));
    }

    // Create or update indicator
    @PostMapping
    public ResponseEntity<IndicatorMonthly> saveIndicator(@RequestBody IndicatorMonthly indicator) {
        return ResponseEntity.ok(monthlyService.saveIndicator(indicator));
    }

    // Delete indicator by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteIndicatorById(@PathVariable Long id) {
        monthlyService.deleteIndicatorById(id);
        return ResponseEntity.noContent().build();
    }
}



