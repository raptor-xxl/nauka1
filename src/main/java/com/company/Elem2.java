package com.company;

public class Elem2 extends Elem {
    private double a;
    public Elem2(String s, int i, double a) {
        super(s, i);
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}
