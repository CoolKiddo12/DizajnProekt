package com.example.demo.service;

import com.example.demo.model.Indicators_daily;
import java.util.List;

public interface DailyService {

    // Retrieve all indicators
    List<Indicators_daily> getAllIndicators();

    // Retrieve indicators by ID
    Indicators_daily getIndicatorById(Long id);

    // Retrieve indicators by SYMBOL
    List<Indicators_daily> getIndicatorsBySymbol(String symbol);

    // Retrieve indicators by SIGNAL
    List<Indicators_daily> getIndicatorsBySignal(String signal);

    // Save or update indicator
    Indicators_daily saveIndicator(Indicators_daily indicator);

    // Delete indicator by ID
    void deleteIndicatorById(Long id);
}
