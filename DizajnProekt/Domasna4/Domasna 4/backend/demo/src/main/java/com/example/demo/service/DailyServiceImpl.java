package com.example.demo.service;

import com.example.demo.model.Indicators_daily;
import com.example.demo.repository.DailyRepository;
import com.example.demo.service.DailyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DailyServiceImpl extends BaseIndicatorServiceImpl<Indicators_daily> implements DailyService {

    @Autowired
    private DailyRepository dailyRepository;

    @Override
    protected DailyRepository getRepository() {
        return dailyRepository;
    }

    @Override
    protected String getSymbol(Indicators_daily entity) {
        return entity.getIssuer().getSymbol(); // Assuming getIssuer() returns the Issuers object with getSymbol().
    }

    @Override
    protected String getSignal(Indicators_daily entity) {
        return entity.getSignal(); // Assuming getSignal() directly returns the signal string.
    }
}

