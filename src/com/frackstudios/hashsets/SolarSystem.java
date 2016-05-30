package com.frackstudios.hashsets;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by CrypticDev on 4/4/2016.
 * Edited 4/5/2016 - Added methods.
 * Edited 4/6/2016 - Added Enum, added toString method, edited equals and hashcode method.
 */
public class SolarSystem {
    private final Key key;
    private final double orbitalPeriod;
    private final Set<SolarSystem> satellites;

    public enum BodyTypes {
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    public SolarSystem(String name, double orbitalPeriod, BodyTypes bodyType) {
        this.key = new Key(name, bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public Key getKey() {
        return key;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addSatellite(SolarSystem moon) {
        return this.satellites.add(moon);
    }

    public Set<SolarSystem> getSatellites() {
        return new HashSet<>(this.satellites);
    }

    @Override // rewrote whole method on 4/6/2016
    public final boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj instanceof SolarSystem) {
            SolarSystem theObject = (SolarSystem) obj;
            return this.key.equals(theObject.getKey());
        }
        return false;
    }

    public static Key makeKey(String name, BodyTypes bodyType) {
        return new Key(name, bodyType);
    }

    @Override // Edited code on 4/6/2016 ( added this.bodyType.hashCode() )
    public final int hashCode() {
        return this.key.hashCode();
    }

    @Override // Added 4/6/2016
    public String toString() {
        return this.key.name + ": " + this.key.bodyType + ", " + this.orbitalPeriod;
    }

    public static final class Key {
        private String name;
        private BodyTypes bodyType;

        private Key(String name, BodyTypes bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyTypes getBodyType() {
            return bodyType;
        }

        @Override
        public boolean equals(Object o) {
            Key key = (Key) o;
            if (this.name.equals(key.getName())){
                return (this.bodyType == key.getBodyType());
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyType.hashCode();
        }

        @Override
        public String toString() {
            return this.name + ": " + this.bodyType;
        }
    }
}
