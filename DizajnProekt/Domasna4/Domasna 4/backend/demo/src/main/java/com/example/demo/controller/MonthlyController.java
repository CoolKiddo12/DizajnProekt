package com.example.demo.controller;

import com.example.demo.model.IndicatorMonthly;
import com.example.demo.service.MonthlyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/indicators/monthly")
public class MonthlyController extends BaseIndicatorController<IndicatorMonthly> {

    @Autowired
    private MonthlyService monthlyService;

    @Override
    protected MonthlyService getService() {
        return monthlyService;
    }
}
