package com.company.animals;

public abstract class Animal {

    public Animal() {

    }

    public Animal(float mass, Brain brain) {
        this.mass = mass;
        this.brain = brain;
    }

    public Animal(float mass) {
        this.mass = mass;
    }

    public float mass;
    private Brain brain;

    public float getMass() {
        return mass;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }

    public Brain getBrain() {
        return brain;
    }

    public void setBrain(Brain brain) {
        this.brain = brain;
    }

    public abstract void makeSound();
}
