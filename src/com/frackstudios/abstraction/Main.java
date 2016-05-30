package com.frackstudios.abstraction;

/**
 * Created by crypticdev on 2/25/16.
 */
public class Main {
    public static void main(String[] args) {


        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();
        dog.getName();

        Parrot bird = new Parrot("Australian ringneck");
        bird.breathe();
        bird.fly();
        bird.eat();
    }
}
