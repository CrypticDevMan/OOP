package com.frackstudios.composition;

/**
 * Created by CrypticDev on 2/1/2016.
 */
public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("2208", "Dell", dimensions, "240");

        Monitor monitor = new Monitor("Acer", "27inch Beast", 27, new Resolution(2540, 1440));
        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, monitor, motherboard);
        thePC.powerUp();
    }
}
