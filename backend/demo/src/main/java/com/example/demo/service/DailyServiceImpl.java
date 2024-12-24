package com.example.demo.service;

import com.example.demo.model.Indicators_daily;
import com.example.demo.repository.DailyRepository;
import com.example.demo.service.DailyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DailyServiceImpl implements DailyService {

    @Autowired
    private DailyRepository dailyRepository;

    @Override
    public List<Indicators_daily> getAllIndicators() {
        return dailyRepository.findAll();
    }

    @Override
    public Indicators_daily getIndicatorById(Long id) {
        Optional<Indicators_daily> indicator = dailyRepository.findById(id);
        return indicator.orElse(null);
    }

    @Override
    public List<Indicators_daily> getIndicatorsBySymbol(String symbol) {
        return dailyRepository.findAll().stream()
                .filter(i -> i.getIssuer().getSymbol().equalsIgnoreCase(symbol))
                .toList();
    }

    @Override
    public List<Indicators_daily> getIndicatorsBySignal(String signal) {
        return dailyRepository.findAll().stream()
                .filter(i -> i.getSignal().equalsIgnoreCase(signal))
                .toList();
    }

    @Override
    public Indicators_daily saveIndicator(Indicators_daily indicator) {
        return dailyRepository.save(indicator);
    }

    @Override
    public void deleteIndicatorById(Long id) {
        dailyRepository.deleteById(id);
    }
}
