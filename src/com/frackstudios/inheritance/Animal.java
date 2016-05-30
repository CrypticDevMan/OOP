package com.frackstudios.inheritance;

/**
 * Created by CrypticDev on 1/31/2016.
 */
public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Animal.eat() code");
    }

    public void move(int speed) {
        System.out.println("Animal speed: " + speed);

    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getBody() {
        return body;
    }

    public int getBrain() {
        return brain;
    }

    public int getWeight() {
        return weight;
    }
}
