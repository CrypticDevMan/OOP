package com.frackstudios.composition;

/**
 * Created by CrypticDev on 2/1/2016.
 */
public class Monitor {

    private String model;
    private String manu;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String manu, String model, int size, Resolution nativeResolution) {
        this.manu = manu;
        this.model = model;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + "," + y + " in color " + color);
    }



    public String getManu() {
        return manu;
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
