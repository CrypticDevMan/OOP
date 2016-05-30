package com.frackstudios.concurrency;

import static com.frackstudios.concurrency.ThreadColor.ANSI_BLUE;

/**
 * Created by CrypticDev on 5/30/2016.
 */
public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from " + currentThread().getName());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE+ "Another thread woke me up");
        }

        System.out.println(ANSI_BLUE+ "Three seconds have passed and I'm awake.");
    }
}
