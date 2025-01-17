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
public class WeeklyServiceImpl extends BaseIndicatorServiceImpl<IndicatorsWeekly> implements WeeklyService {

    @Autowired
    private WeeklyRepository weeklyRepository;

    @Override
    protected WeeklyRepository getRepository() {
        return weeklyRepository;
    }

    @Override
    protected String getSymbol(IndicatorsWeekly entity) {
        return entity.getIssuer().getSymbol();
    }

    @Override
    protected String getSignal(IndicatorsWeekly entity) {
        return entity.getSignal();
    }
}


