package com.company.devices;

public class FlyingObjects extends Device {
    private final Double altitude = 7.0;

    public FlyingObjects(Double altitude) {
        super(3);
        //this.altitude = altitude;
        System.out.println("Flying Object Constructor");
    }

    public boolean canFly() {
        System.out.println(altitude.toString());
        return false;
    }

    public double getAltitude() {
        return altitude;
    }

    public String toString() {
        return "altitude: " + altitude + ", " + super.toString();
    }
}
