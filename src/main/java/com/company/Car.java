package com.company;

public class Car {
    static int x;
    final private float speed;
    private int doors;

    Car() {
        speed = 7;
        System.out.println("Car constructor 1");
    }

    Car(float speed) {
        this.speed = speed;
        x = 6;
    }

    Car(float speed, int doors) {
        this.speed = speed;
        this.doors = doors;
    }

    static void fs() {

    }

    public static void main(String[] args) {
        System.out.println("Main z Car");
    }

    static void fs(int i) {

    }

    void f1(int i) {
        int a = x + 6;
    }

    void f1() {

    }

    void f3() {

    }

    public float getSpeed() {
        return speed;
    }

    public int getDoors() {
        return doors;
    }

    void setDoors(int d) {
        doors = 3;
    }
}
