package com.example.demo.service;

import com.example.demo.model.IndicatorMonthly;
import java.util.List;

public interface MonthlyService {

    // Retrieve all indicators
    List<IndicatorMonthly> getAllIndicators();

    // Retrieve indicators by ID
    IndicatorMonthly getIndicatorById(Long id);

    // Retrieve indicators by SYMBOL
    List<IndicatorMonthly> getIndicatorsBySymbol(String symbol);

    // Retrieve indicators by SIGNAL
    List<IndicatorMonthly> getIndicatorsBySignal(String signal);

    // Save or update indicator
    IndicatorMonthly saveIndicator(IndicatorMonthly indicator);

    // Delete indicator by ID
    void deleteIndicatorById(Long id);
}

