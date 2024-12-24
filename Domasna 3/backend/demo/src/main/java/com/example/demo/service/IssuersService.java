package com.example.demo.service;

import com.example.demo.model.Issuers;

import java.util.List;

public interface IssuersService {
    List<Issuers> findAll();
    Issuers findById(Long id);
    Issuers findBySymbol(String symbol);
    void save(Issuers issuer);
    void deleteById(Long id);
}

