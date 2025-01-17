package com.example.demo.service;

import com.example.demo.model.IndicatorMonthly;
import com.example.demo.repository.MonthlyRepository;
import com.example.demo.service.MonthlyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MonthlyServiceImpl extends BaseIndicatorServiceImpl<IndicatorMonthly> implements MonthlyService {

    @Autowired
    private MonthlyRepository monthlyRepository;

    @Override
    protected MonthlyRepository getRepository() {
        return monthlyRepository;
    }

    @Override
    protected String getSymbol(IndicatorMonthly entity) {
        return entity.getIssuer().getSymbol();
    }

    @Override
    protected String getSignal(IndicatorMonthly entity) {
        return entity.getSignal();
    }
}
