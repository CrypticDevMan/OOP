package com.frackstudios.generics;

/**
 * Created by crypticdev on 2/26/16.
 */
public abstract class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
