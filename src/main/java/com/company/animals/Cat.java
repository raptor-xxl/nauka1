package com.company.animals;

public final class Cat extends Animal {

    public float mass;

    public Cat() {
        super(5);
        final int a = 7;

    }

    public void makeSound() {
        super.mass = 5;
        System.out.println("Miau");
    }

    public void setMass(float mass) {
        if (mass > 100) {
            mass = 100;
        }
        setBrain(null);
        super.setMass(mass);
    }

}
