package com.zenalyst.milkrouting.controller;

import com.zenalyst.milkrouting.entity.CollectionPoint;
import com.zenalyst.milkrouting.service.CollectionPointService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/collection-points")
public class CollectionPointController {

    private final CollectionPointService service;

    public CollectionPointController(CollectionPointService service) {
        this.service = service;
    }

    @PostMapping
    public CollectionPoint create(@RequestBody CollectionPoint point) {
        return service.create(point);
    }

    @GetMapping
    public List<CollectionPoint> getAll() {
        return service.getAll();
    }
}