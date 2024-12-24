package com.example.demo.service;

import com.example.demo.model.IndicatorMonthly;
import com.example.demo.repository.MonthlyRepository;
import com.example.demo.service.MonthlyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MonthlyServiceImpl implements MonthlyService {

    @Autowired
    private MonthlyRepository monthlyRepository;

    @Override
    public List<IndicatorMonthly> getAllIndicators() {
        return monthlyRepository.findAll();
    }

    @Override
    public IndicatorMonthly getIndicatorById(Long id) {
        Optional<IndicatorMonthly> indicator = monthlyRepository.findById(id);
        return indicator.orElse(null);
    }

    @Override
    public List<IndicatorMonthly> getIndicatorsBySymbol(String symbol) {
        return monthlyRepository.findAll().stream()
                .filter(i -> i.getIssuer().getSymbol().equalsIgnoreCase(symbol))
                .toList();
    }

    @Override
    public List<IndicatorMonthly> getIndicatorsBySignal(String signal) {
        return monthlyRepository.findAll().stream()
                .filter(i -> i.getSignal().equalsIgnoreCase(signal))
                .toList();
    }

    @Override
    public IndicatorMonthly saveIndicator(IndicatorMonthly indicator) {
        return monthlyRepository.save(indicator);
    }

    @Override
    public void deleteIndicatorById(Long id) {
        monthlyRepository.deleteById(id);
    }
}

