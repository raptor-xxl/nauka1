package com.company.devices;

public class Helicopter extends FlyingObjects {

    private final int rotorCount;

    public Helicopter(int rotorCount) {
        super(7.0);
        this.rotorCount = rotorCount;
    }

    public String toString() {
        return "rotor count: " + rotorCount;
    }

    public int getRotorCount() {
        return rotorCount;

    }
}
