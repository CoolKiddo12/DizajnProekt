package com.example.demo.service;

import com.example.demo.service.IndicatorsBaseService;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public abstract class BaseIndicatorServiceImpl<T> implements IndicatorsBaseService<T> {

    protected abstract JpaRepository<T, Long> getRepository();

    // Must be implemented in subclasses to fetch the "symbol" field dynamically
    protected abstract String getSymbol(T entity);

    // Must be implemented in subclasses to fetch the "signal" field dynamically
    protected abstract String getSignal(T entity);

    @Override
    public List<T> getAllIndicators() {
        return getRepository().findAll();
    }

    @Override
    public T getIndicatorById(Long id) {
        Optional<T> indicator = getRepository().findById(id);
        return indicator.orElse(null);
    }

    @Override
    public List<T> getIndicatorsBySymbol(String symbol) {
        return getRepository().findAll().stream()
                .filter(i -> getSymbol(i).equalsIgnoreCase(symbol))
                .collect(Collectors.toList());
    }

    @Override
    public List<T> getIndicatorsBySignal(String signal) {
        return getRepository().findAll().stream()
                .filter(i -> getSignal(i).equalsIgnoreCase(signal))
                .collect(Collectors.toList());
    }

    @Override
    public T saveIndicator(T indicator) {
        return getRepository().save(indicator);
    }

    @Override
    public void deleteIndicatorById(Long id) {
        getRepository().deleteById(id);
    }
}
