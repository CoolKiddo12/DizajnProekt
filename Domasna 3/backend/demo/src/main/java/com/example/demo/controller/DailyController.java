package com.example.demo.controller;

import com.example.demo.model.Indicators_daily;
import com.example.demo.service.DailyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/indicators/daily")
public class DailyController {

    @Autowired
    private DailyService dailyService;

    // Get all indicators
    @GetMapping
    public ResponseEntity<List<Indicators_daily>> getAllIndicators() {
        return ResponseEntity.ok(dailyService.getAllIndicators());
    }

    // Get indicator by ID
    @GetMapping("/{id}")
    public ResponseEntity<Indicators_daily> getIndicatorById(@PathVariable Long id) {
        return ResponseEntity.ok(dailyService.getIndicatorById(id));
    }

    // Get indicators by SYMBOL
    @GetMapping("/symbol/{symbol}")
    public ResponseEntity<List<Indicators_daily>> getIndicatorsBySymbol(@PathVariable String symbol) {
        return ResponseEntity.ok(dailyService.getIndicatorsBySymbol(symbol));
    }

    // Get indicators by SIGNAL
    @GetMapping("/signal/{signal}")
    public ResponseEntity<List<Indicators_daily>> getIndicatorsBySignal(@PathVariable String signal) {
        return ResponseEntity.ok(dailyService.getIndicatorsBySignal(signal));
    }

    // Create or update indicator
    @PostMapping
    public ResponseEntity<Indicators_daily> saveIndicator(@RequestBody Indicators_daily indicator) {
        return ResponseEntity.ok(dailyService.saveIndicator(indicator));
    }

    // Delete indicator by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteIndicatorById(@PathVariable Long id) {
        dailyService.deleteIndicatorById(id);
        return ResponseEntity.noContent().build();
    }
}

