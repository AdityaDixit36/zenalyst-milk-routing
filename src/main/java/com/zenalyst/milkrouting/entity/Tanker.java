package com.zenalyst.milkrouting.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tankers")
public class Tanker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String tankerNumber;

    private Double capacity;

    public Tanker() {
    }

    public Long getId() {
        return id;
    }

    public String getTankerNumber() {
        return tankerNumber;
    }

    public void setTankerNumber(String tankerNumber) {
        this.tankerNumber = tankerNumber;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }
}