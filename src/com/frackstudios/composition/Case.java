package com.frackstudios.composition;


/**
 * Created by CrypticDev on 2/1/2016.
 */
public class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, Dimensions dimensions, String powerSupply) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.dimensions = dimensions;
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
