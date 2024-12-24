package com.example.demo.repository;

import com.example.demo.model.Issuers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IssuersRepository extends JpaRepository<Issuers, Long> {
    Optional<Issuers> findBySymbol(String symbol);
}

