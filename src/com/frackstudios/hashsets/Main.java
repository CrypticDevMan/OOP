package com.frackstudios.hashsets;

import java.util.*;

/**
 * Created by CrypticDev on 4/4/2016.
 */
public class Main {

    private static Map<SolarSystem.Key, SolarSystem> solarSystem = new HashMap<>();
    private static Set<SolarSystem> planets = new HashSet<>();

    public static void main(String[] args) {
        SolarSystem temp = new Planet("Mercury", 88);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Venus", 225);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Earth", 365);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        SolarSystem tempMoon = new Moon("Moon", 27);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon);

        temp = new Planet("Mars", 687);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Deimos", 1.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Mars

        tempMoon = new Moon("Phobos", 0.3);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Mars

        temp = new Planet("Jupiter", 4332);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        tempMoon = new Moon("Io", 1.8);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Europa", 3.5);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Ganymede", 7.1);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        tempMoon = new Moon("Callisto", 16.7);
        solarSystem.put(tempMoon.getKey(), tempMoon);
        temp.addSatellite(tempMoon); // temp is still Jupiter

        temp = new Planet("Saturn", 10759);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Uranus", 30660);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Neptune", 165);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        temp = new Planet("Pluto", 248);
        solarSystem.put(temp.getKey(), temp);
        planets.add(temp);

        System.out.println("Planets");
        for(SolarSystem planet : planets) {
            System.out.println("\t" + planet.getKey());
        }

        SolarSystem body = solarSystem.get(SolarSystem.makeKey("Mars", SolarSystem.BodyTypes.PLANET));
        System.out.println("Moons of " + body.getKey());
        for(SolarSystem jupiterMoon: body.getSatellites()) {
            System.out.println("\t" + jupiterMoon.getKey());
        }

        Set<SolarSystem> moons = new HashSet<>();
        for(SolarSystem planet : planets) {
            moons.addAll(planet.getSatellites());
        }

        System.out.println("All Moons");
        for(SolarSystem moon : moons) {
            System.out.println("\t" + moon.getKey());
        }

        SolarSystem pluto = new DwarfPlanet("Pluto", 842);
        planets.add(pluto);

        for (SolarSystem planet : planets) System.out.println(planet);

        System.out.println("*******************************");

        for (SolarSystem Moon : moons) System.out.println(Moon);

        solarSystem.put(pluto.getKey(), pluto);
        System.out.println(solarSystem.get(SolarSystem.makeKey("Pluto", SolarSystem.BodyTypes.PLANET)));
        System.out.println(solarSystem.get(SolarSystem.makeKey("Pluto", SolarSystem.BodyTypes.DWARF_PLANET)));

        System.out.println("***********");
        System.out.println("Our solar system contains:");
        solarSystem.values().forEach(System.out::println);

        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));
        words.forEach(System.out::println);
    }
}
