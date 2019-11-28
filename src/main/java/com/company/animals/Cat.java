package com.company.animals;

import com.company.animals.Animal;

public final class Cat extends Animal {

    public Cat() {
        super(5);
        final int a = 7;

    }

    public float mass;

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
