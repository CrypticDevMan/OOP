package com.frackstudios.concurrency;

import static com.frackstudios.concurrency.ThreadColor.ANSI_RED;

/**
 * Created by ToxicA0E on 5/30/2016.
 */
public class MyRunnable  implements  Runnable{

    @Override
    public void run() {
        System.out.println(ANSI_RED+"Hello from MyRunnable's implementation of run()");
    }
}
