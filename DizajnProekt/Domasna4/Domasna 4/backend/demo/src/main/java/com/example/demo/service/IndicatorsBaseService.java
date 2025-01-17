package com.example.demo.service;

import java.util.List;

public interface IndicatorsBaseService<T> {
    // Retrieve all indicators
    List<T> getAllIndicators();

    // Retrieve indicators by ID
    T getIndicatorById(Long id);

    // Retrieve indicators by SYMBOL
    List<T> getIndicatorsBySymbol(String symbol);

    // Retrieve indicators by SIGNAL
    List<T> getIndicatorsBySignal(String signal);

    // Save or update indicator
    T saveIndicator(T indicator);

    // Delete indicator by ID
    void deleteIndicatorById(Long id);
}

