package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class IndicatorsBase {

    @Id
    private Long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private Issuers issuer;

    @Column(name = "High_Price", nullable = true)
    private Double highPrice;

    @Column(name = "Low_Price", nullable = true)
    private Double lowPrice;

    @Column(name = "SMA_50", nullable = true)
    private Double sma50;

    @Column(name = "SMA_200", nullable = true)
    private Double sma200;

    @Column(name = "EMA_50", nullable = true)
    private Double ema50;

    @Column(name = "EMA_200", nullable = true)
    private Double ema200;

    @Column(name = "RSI", nullable = true)
    private Double rsi;

    @Column(name = "Stochastic", nullable = true)
    private Double stochastic;

    @Column(name = "MACD", nullable = true)
    private Double macd;

    @Column(name = "CCI", nullable = true)
    private Double cci;

    @Column(name = "Williams_R", nullable = true)
    private Double williamsR;

    @Column(name = "Signal", nullable = true)
    private String signal;
}

