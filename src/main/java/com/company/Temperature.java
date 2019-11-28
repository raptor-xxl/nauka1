package com.company;

public class Temperature {
    private static final double ZERO_CELSIUS_IN_KELVIN = 273.16;
    private double c;

    public double getCelsius() {
        return c;
    }

    public void setCelsius(double t) {
        this.c = t;
    }

    public double getKelvin() {

        return c + ZERO_CELSIUS_IN_KELVIN;
    }

    public void setKelvin(double t) {
        c = t - ZERO_CELSIUS_IN_KELVIN;
    }

    public double get(TemperatureScale ts) {
        if (ts == TemperatureScale.CELSIUS) {
            return getCelsius();
        } else {
            return getCelsius();
        }
    }

    public void set(TemperatureScale ts, double t) {
        if (ts == TemperatureScale.CELSIUS) {
            setCelsius(t);
        } else {
            setKelvin(t);
        }
    }

    public boolean equals(Temperature obj) {
        if (null == obj) {
            return false;
        }
        return this.c == obj.c;
    }

    public boolean less(Temperature t) {
        return this.c < t.c;
    }

    public boolean greater(Temperature t) {
        return c > t.c;
    }
}
