package com.zenalyst.milkrouting.service;

import com.zenalyst.milkrouting.entity.RouteStop;
import com.zenalyst.milkrouting.repository.RouteStopRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteStopService {

    private final RouteStopRepository repository;

    public RouteStopService(RouteStopRepository repository) {
        this.repository = repository;
    }

    public RouteStop create(RouteStop stop) {
        return repository.save(stop);
    }

    public List<RouteStop> getByRoute(Long routeId) {
        return repository.findByRouteIdOrderBySequenceNumber(routeId);
    }
}