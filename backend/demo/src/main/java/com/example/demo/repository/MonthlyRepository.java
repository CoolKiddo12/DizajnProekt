package com.example.demo.repository;

import com.example.demo.model.IndicatorMonthly;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonthlyRepository extends JpaRepository<IndicatorMonthly, Long> {
}
