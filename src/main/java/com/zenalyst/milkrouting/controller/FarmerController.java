package com.zenalyst.milkrouting.controller;

import com.zenalyst.milkrouting.entity.Farmer;
import com.zenalyst.milkrouting.service.FarmerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/farmers")
public class FarmerController {

    private final FarmerService farmerService;

    public FarmerController(FarmerService farmerService) {
        this.farmerService = farmerService;
    }

    @PostMapping
    public Farmer createFarmer(@RequestBody Farmer farmer) {
        return farmerService.createFarmer(farmer);
    }

    @GetMapping
    public List<Farmer> getAllFarmers() {
        return farmerService.getAllFarmers();
    }

    @GetMapping("/{id}")
    public Farmer getFarmerById(@PathVariable Long id) {
        return farmerService.getFarmerById(id);
    }
}