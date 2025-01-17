package com.example.demo.controller;

import com.example.demo.model.IndicatorsWeekly;
import com.example.demo.service.WeeklyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/indicators/weekly")
public class WeeklyController extends BaseIndicatorController<IndicatorsWeekly> {

    @Autowired
    private WeeklyService weeklyService;

    @Override
    protected WeeklyService getService() {
        return weeklyService;
    }
}
