package com.example.demo.service;

import com.example.demo.model.Issuers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.IssuersRepository;

import java.util.List;
import java.util.Optional;

@Service
public class IssuersServiceImpl implements IssuersService {
    private final IssuersRepository issuersRepository;

    @Autowired
    public IssuersServiceImpl(IssuersRepository issuersRepository) {
        this.issuersRepository = issuersRepository;
    }

    @Override
    public List<Issuers> findAll() {
        return issuersRepository.findAll();
    }

    @Override
    public Issuers findById(Long id) {
        Optional<Issuers> issuer = issuersRepository.findById(id);
        return issuer.orElse(null);
    }

    @Override
    public void save(Issuers issuer) {
        issuersRepository.save(issuer);
    }

    @Override
    public void deleteById(Long id) {
        issuersRepository.deleteById(id);
    }

    @Override
    public Issuers findBySymbol(String symbol) {
        return issuersRepository.findBySymbol(symbol).orElse(null);
    }
}
