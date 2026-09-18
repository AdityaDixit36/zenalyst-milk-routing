package com.zenalyst.milkrouting.controller;

import com.zenalyst.milkrouting.entity.RouteStop;
import com.zenalyst.milkrouting.service.RouteStopService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/route-stops")
public class RouteStopController {

    private final RouteStopService service;

    public RouteStopController(RouteStopService service) {
        this.service = service;
    }

    @PostMapping
    public RouteStop create(@RequestBody RouteStop stop) {
        return service.create(stop);
    }

    @GetMapping("/route/{routeId}")
    public List<RouteStop> getByRoute(@PathVariable Long routeId) {
        return service.getByRoute(routeId);
    }
}