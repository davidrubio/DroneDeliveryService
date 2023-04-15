package com.drone.entity;

public class Drone {
    private String name;
    private int maxWeight;

    public Drone(String name, int maxWeight) {
        this.name = name;
        this.maxWeight = maxWeight;
    }

    public String getName() {
        return name;
    }

    public int getMaxWeight() {
        return maxWeight;
    }
}