package com.example.demo.controller;

import com.example.demo.model.IndicatorsWeekly;
import com.example.demo.service.WeeklyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/indicators/weekly")
public class WeeklyController {

    @Autowired
    private WeeklyService weeklyService;

    // Get all indicators
    @GetMapping
    public ResponseEntity<List<IndicatorsWeekly>> getAllIndicators() {
        return ResponseEntity.ok(weeklyService.getAllIndicators());
    }

    // Get indicator by ID
    @GetMapping("/{id}")
    public ResponseEntity<IndicatorsWeekly> getIndicatorById(@PathVariable Long id) {
        return ResponseEntity.ok(weeklyService.getIndicatorById(id));
    }

    // Get indicators by SYMBOL
    @GetMapping("/symbol/{symbol}")
    public ResponseEntity<List<IndicatorsWeekly>> getIndicatorsBySymbol(@PathVariable String symbol) {
        return ResponseEntity.ok(weeklyService.getIndicatorsBySymbol(symbol));
    }

    // Get indicators by SIGNAL
    @GetMapping("/signal/{signal}")
    public ResponseEntity<List<IndicatorsWeekly>> getIndicatorsBySignal(@PathVariable String signal) {
        return ResponseEntity.ok(weeklyService.getIndicatorsBySignal(signal));
    }

    // Create or update indicator
    @PostMapping
    public ResponseEntity<IndicatorsWeekly> saveIndicator(@RequestBody IndicatorsWeekly indicator) {
        return ResponseEntity.ok(weeklyService.saveIndicator(indicator));
    }

    // Delete indicator by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteIndicatorById(@PathVariable Long id) {
        weeklyService.deleteIndicatorById(id);
        return ResponseEntity.noContent().build();
    }
}


