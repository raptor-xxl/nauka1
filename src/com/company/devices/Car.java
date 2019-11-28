package com.company.devices;

public class Car extends Device {

    public Car() {
        super(0);
        System.out.println("Car Constructor");
    }

    public boolean canFly() {
        return false;
    }
}
