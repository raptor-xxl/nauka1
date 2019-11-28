package com.company.devices;

public abstract class Device {
    private final double mass;

    protected Device(double mass) {
        this.mass = mass;
        System.out.println("Device constructor");
        canFly();
    }

    public double getMass() {
        return mass;
    }

    public abstract boolean canFly();

    public String toString() {
        return "mass: " + mass;
    }
}
