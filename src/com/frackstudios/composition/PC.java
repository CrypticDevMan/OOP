package com.frackstudios.composition;

/**
 * Created by CrypticDev on 2/1/2016.
 */
public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }


    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // fancy graphics
        monitor.drawPixelAt(1200, 50, "yellow");
    }

}
