package com.example.demo.repository;

import com.example.demo.model.Indicators_daily;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailyRepository extends JpaRepository<Indicators_daily, Long> {
}

