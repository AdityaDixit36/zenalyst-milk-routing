package com.zenalyst.milkrouting.controller;

import com.zenalyst.milkrouting.entity.Route;
import com.zenalyst.milkrouting.service.RouteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/routes")
public class RouteController {

    private final RouteService service;

    public RouteController(RouteService service) {
        this.service = service;
    }

    @PostMapping
    public Route create(@RequestBody Route route) {
        return service.create(route);
    }

    @GetMapping
    public List<Route> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Route getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping("/check-holding")
    public String checkHolding(@RequestParam Long routeId,
            @RequestParam int arrivalMinutes) {

        Route route = service.getById(routeId);

        if (service.isWithinHoldingLimit(route, arrivalMinutes)) {
            return "Route is within milk holding limit";
        }

        return "WARNING: Route exceeds milk holding limit";
    }
}