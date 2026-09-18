package com.zenalyst.milkrouting.controller;

import com.zenalyst.milkrouting.entity.TankerStatus;
import com.zenalyst.milkrouting.service.TankerStatusService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tankers")
public class TankerStatusController {

    private final TankerStatusService service;

    public TankerStatusController(TankerStatusService service) {
        this.service = service;
    }

    @PutMapping("/{tankerId}/status")
    public TankerStatus updateStatus(
            @PathVariable Long tankerId,
            @RequestBody TankerStatus status) {

        return service.updateStatus(status);
    }

    @GetMapping("/{tankerId}/status")
    public TankerStatus getStatus(@PathVariable Long tankerId) {
        return service.getStatus(tankerId);
    }

    @GetMapping("/{tankerId}/eta/{stopSequence}")
    public String getEta(@PathVariable Long tankerId,
            @PathVariable Integer stopSequence) {

        TankerStatus status = service.getStatus(tankerId);

        if (status.getCurrentStopSequence() >= stopSequence) {
            return "Tanker has already reached or passed this stop";
        }

        return "Tanker is on the way to stop " + stopSequence;
    }
}