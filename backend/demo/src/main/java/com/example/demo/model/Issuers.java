package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "ISSUERS")
@NoArgsConstructor
@AllArgsConstructor
public class Issuers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Symbol", nullable = false)
    private String symbol;

    @Column(name = "Date", nullable = false)
    private LocalDate date;

    @Column(name = "Close_Price", nullable = true)
    private Double closePrice;

    @Column(name = "Volume", nullable = true)
    private Double volume;
}
