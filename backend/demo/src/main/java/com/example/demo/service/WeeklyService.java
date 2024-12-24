package com.example.demo.service;

import com.example.demo.model.IndicatorsWeekly;
import java.util.List;

public interface WeeklyService {

    // Retrieve all indicators
    List<IndicatorsWeekly> getAllIndicators();

    // Retrieve indicators by ID
    IndicatorsWeekly getIndicatorById(Long id);

    // Retrieve indicators by SYMBOL
    List<IndicatorsWeekly> getIndicatorsBySymbol(String symbol);

    // Retrieve indicators by SIGNAL
    List<IndicatorsWeekly> getIndicatorsBySignal(String signal);

    // Save or update indicator
    IndicatorsWeekly saveIndicator(IndicatorsWeekly indicator);

    // Delete indicator by ID
    void deleteIndicatorById(Long id);
}
