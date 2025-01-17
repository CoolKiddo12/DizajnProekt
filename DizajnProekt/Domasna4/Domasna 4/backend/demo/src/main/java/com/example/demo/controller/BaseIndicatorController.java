package com.example.demo.controller;

import com.example.demo.service.IndicatorsBaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class BaseIndicatorController<T> {

    protected abstract IndicatorsBaseService<T> getService();

    // Get all indicators
    @GetMapping
    public ResponseEntity<List<T>> getAllIndicators() {
        return ResponseEntity.ok(getService().getAllIndicators());
    }

    // Get indicator by ID
    @GetMapping("/{id}")
    public ResponseEntity<T> getIndicatorById(@PathVariable Long id) {
        T indicator = getService().getIndicatorById(id);
        if (indicator == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(indicator);
    }

    // Get indicators by SYMBOL
    @GetMapping("/symbol/{symbol}")
    public ResponseEntity<List<T>> getIndicatorsBySymbol(@PathVariable String symbol) {
        return ResponseEntity.ok(getService().getIndicatorsBySymbol(symbol));
    }

    // Get indicators by SIGNAL
    @GetMapping("/signal/{signal}")
    public ResponseEntity<List<T>> getIndicatorsBySignal(@PathVariable String signal) {
        return ResponseEntity.ok(getService().getIndicatorsBySignal(signal));
    }

    // Create or update indicator
    @PostMapping
    public ResponseEntity<T> saveIndicator(@RequestBody T indicator) {
        return ResponseEntity.ok(getService().saveIndicator(indicator));
    }

    // Delete indicator by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteIndicatorById(@PathVariable Long id) {
        getService().deleteIndicatorById(id);
        return ResponseEntity.noContent().build();
    }
}

