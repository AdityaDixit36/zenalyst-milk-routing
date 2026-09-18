package com.zenalyst.milkrouting.controller;

import com.zenalyst.milkrouting.entity.Tanker;
import com.zenalyst.milkrouting.service.TankerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tankers")
public class TankerController {

    private final TankerService service;

    public TankerController(TankerService service) {
        this.service = service;
    }

    @PostMapping
    public Tanker create(@RequestBody Tanker tanker) {
        return service.create(tanker);
    }

    @GetMapping
    public List<Tanker> getAll() {
        return service.getAll();
    }
}