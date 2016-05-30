package com.frackstudios.concurrency;

import static com.frackstudios.concurrency.ThreadColor.ANSI_GREEN;
import static com.frackstudios.concurrency.ThreadColor.ANSI_PURPLE;

/**
 * Created by ToxicA0E on 5/29/2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE+"Hello from the main thread!");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== AnotherThread ==");
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN+"Hello from the anonymous class thread!");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable());
        myRunnableThread.start();

        System.out.println(ANSI_PURPLE+"Hello again from the main thread.");

    }
}
