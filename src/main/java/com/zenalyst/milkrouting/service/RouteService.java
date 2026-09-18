package com.zenalyst.milkrouting.service;

import com.zenalyst.milkrouting.entity.Route;
import com.zenalyst.milkrouting.repository.RouteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteService {

    private final RouteRepository repository;

    public RouteService(RouteRepository repository) {
        this.repository = repository;
    }

    public Route create(Route route) {
        return repository.save(route);
    }

    public List<Route> getAll() {
        return repository.findAll();
    }

    public Route getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Route not found"));
    }

    public boolean isWithinHoldingLimit(Route route, int arrivalMinutes) {
        int maxMinutes = route.getMaxHoldingMinutes();
        return arrivalMinutes <= maxMinutes;
    }
}