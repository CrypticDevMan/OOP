package com.frackstudios.abstraction;

/**
 * Created by crypticdev on 2/25/16.
 */
public abstract class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathing");
    }

    public abstract void fly();

}
