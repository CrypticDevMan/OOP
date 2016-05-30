package com.frackstudios.abstraction;

/**
 * Created by crypticdev on 2/25/16.
 */
public class Parrot extends Bird {

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Flying from branch to branch");
    }
}
