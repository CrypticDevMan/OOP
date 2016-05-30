package com.frackstudios.encapsulation;

/**
 * Created by CrypticDev on 2/1/2016.
 */
public class EnhancedPlayer {

    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        if (health > 0 && health <= 100)
            this.hitPoints = health;


    }

    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if (this.hitPoints <= 0) {
            System.out.println("Player knocked out");
        }
    }

    public int getHealth() {
        return hitPoints;
    }

    public int healthRemaining() {return  this.hitPoints;}
}
