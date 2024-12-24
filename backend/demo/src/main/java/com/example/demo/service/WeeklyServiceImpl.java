package com.example.demo.service;

import com.example.demo.model.IndicatorsWeekly;
import com.example.demo.model.Indicators_daily;
import com.example.demo.repository.WeeklyRepository;
import com.example.demo.service.WeeklyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WeeklyServiceImpl implements WeeklyService {

    @Autowired
    private WeeklyRepository weeklyRepository;

    @Override
    public List<IndicatorsWeekly> getAllIndicators() {
        return weeklyRepository.findAll();
    }

    @Override
    public IndicatorsWeekly getIndicatorById(Long id) {
        Optional<IndicatorsWeekly> indicator = weeklyRepository.findById(id);
        return indicator.orElse(null);
    }

    @Override
    public List<IndicatorsWeekly> getIndicatorsBySymbol(String symbol) {
        return weeklyRepository.findAll().stream()
                .filter(i -> i.getIssuer().getSymbol().equalsIgnoreCase(symbol))
                .toList();
    }

    @Override
    public List<IndicatorsWeekly> getIndicatorsBySignal(String signal) {
        return weeklyRepository.findAll().stream()
                .filter(i -> i.getSignal().equalsIgnoreCase(signal))
                .toList();
    }

    @Override
    public IndicatorsWeekly saveIndicator(IndicatorsWeekly indicator) {
        return weeklyRepository.save(indicator);
    }

    @Override
    public void deleteIndicatorById(Long id) {
        weeklyRepository.deleteById(id);
    }
}


