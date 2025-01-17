package com.example.demo.controller;

import com.example.demo.model.Indicators_daily;
import com.example.demo.service.DailyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/indicators/daily")
public class DailyController extends BaseIndicatorController<Indicators_daily> {

    @Autowired
    private DailyService dailyService;

    @Override
    protected DailyService getService() {
        return dailyService;
    }
}
