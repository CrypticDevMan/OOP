package com.frackstudios.concurrency;

import static com.frackstudios.concurrency.ThreadColor.ANSI_BLUE;

/**
 * Created by CrypticDev on 5/30/2016.
 */
public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "Hello from " + currentThread().getName());
    }
}
