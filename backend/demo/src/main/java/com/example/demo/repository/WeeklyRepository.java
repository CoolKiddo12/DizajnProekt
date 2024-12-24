package com.example.demo.repository;

import com.example.demo.model.IndicatorsWeekly;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeeklyRepository extends JpaRepository<IndicatorsWeekly, Long> {
}