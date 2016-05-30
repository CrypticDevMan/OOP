package com.frackstudios.abstraction;

/**
 * Created by crypticdev on 2/25/16.
 */
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}
