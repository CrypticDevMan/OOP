package com.frackstudios.hashsets;

/**
 * Created by CrypticDev on 4/6/2016.
 */
public class Planet extends SolarSystem {

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSatellite(SolarSystem moon) {
        if (moon.getKey().getBodyType() == BodyTypes.MOON) {
            return super.addSatellite(moon);
        } else {
            return false;
        }
    }


}
