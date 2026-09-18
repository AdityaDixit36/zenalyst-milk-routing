package com.zenalyst.milkrouting.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "routes")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String shift;

    private Integer maxHoldingMinutes = 120;

    @ManyToOne
    @JoinColumn(name = "tanker_id")
    private Tanker tanker;

    public Route() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public Integer getMaxHoldingMinutes() {
        return maxHoldingMinutes;
    }

    public void setMaxHoldingMinutes(Integer maxHoldingMinutes) {
        this.maxHoldingMinutes = maxHoldingMinutes;
    }

    public Tanker getTanker() {
        return tanker;
    }

    public void setTanker(Tanker tanker) {
        this.tanker = tanker;
    }
}