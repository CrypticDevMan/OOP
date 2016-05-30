package com.frackstudios.inheritance;

import com.frackstudios.inheritance.animals.Dog;

/**
 * Created by CrypticDev on 2/1/2016.
 */
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "Long Silky");
        //dog.eat();
        dog.walk();
        //dog.run();
    }
}
