package com.frackstudios.javaio.files;

import java.io.*;
import java.util.*;

/**
 * Created by CrypticDev on 4/11/2016.
 */
public class Locations {
    public static Map<Integer, Location> locations = new HashMap<>();

    private static String[][] FILE_LOCATION = {{"E://javaprograms//OOP//random//locations_big.txt"},{"E://javaprograms//OOP//random//directions_big.txt"}};

    /*public static void main(String[] args) throws IOException {
        try(FileWriter fw = new FileWriter((FILE_LOCATION[0][0]));
            FileWriter direction = new FileWriter((FILE_LOCATION[1][0]))) {
            for (Location location : locations.values()) {
                fw.write(location.getLocationID() + "," + location.getDescription() + "\n");
                for (String directions : location.getExits().keySet()) {
                    direction.write(location.getLocationID() + "," + directions + "," + location.getExits().get(directions) + "\n");
                }
            }
        }
    }*/

    public static void main(String[] args) throws IOException {
        try (DataOutputStream locFile = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("locations.dat")))) {
            for (Location location : locations.values()) {
                locFile.writeInt(location.getLocationID());
                locFile.writeUTF(location.getDescription());
                System.out.println("Writing location " + location.getLocationID() + " : " + location.getDescription());
                System.out.println("Writing " + (location.getExits().size() -1) + " exits");
                locFile.writeInt(location.getExits().size() - 1);
                for (String direction : location.getExits().keySet()) {
                    if (!direction.equalsIgnoreCase("Q")) {
                        System.out.println("\t\t" + direction + "," + location.getExits().get(direction));
                        locFile.writeUTF(direction);
                        locFile.writeInt(location.getExits().get(direction));
                    }
                }
            }
        }
    }

    static {
        try (DataInputStream locFile = new DataInputStream(new BufferedInputStream(new FileInputStream("locations.dat")))) {
            boolean eof = false;
            while (!eof) {
                try {
                    Map<String, Integer> exits = new LinkedHashMap<>();
                    int locID = locFile.readInt();
                    String description = locFile.readUTF();
                    int numExits = locFile.readInt();
                    System.out.println("Read location " + locID + " : " + description);
                    System.out.println("Found " + numExits + " exits");
                    for (int i = 0; i < numExits; i++) {
                        String direction = locFile.readUTF();
                        int destination = locFile.readInt();
                        exits.put(direction, destination);
                        System.out.println("\t\t" + direction + "," + destination);
                    }
                    locations.put(locID, new Location(locID, description, exits));
                } catch (EOFException e) {
                    eof = true;
                }
            }
        } catch (IOException io) {
            System.out.println("IO Exception");
        }
//        try(Scanner scanner = new Scanner(new FileReader(FILE_LOCATION[0][0]))) {
//            scanner.useDelimiter(",");
//            while (scanner.hasNextLine()) {
//                int loc = scanner.nextInt();
//                scanner.skip(scanner.delimiter());
//                String description = scanner.nextLine();
//                System.out.println("Imported loc: " + loc + ": " + description);
//                Map<String, Integer> tempExit = new HashMap<>();
//                locations.put(loc, new Location(loc, description, tempExit));
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // now read the exits
//        try (BufferedReader dirFile = new BufferedReader(new FileReader(FILE_LOCATION[1][0]))) {
//            String input;
//            while ((input = dirFile.readLine()) != null) {
//                String[] data = input.split(",");
//                int loc = Integer.parseInt(data[0]);
//                String direction = data[1];
//                int destination = Integer.parseInt(data[2]);
//
//                System.out.println(loc + ": " + direction + ": " + destination);
//                Location location = locations.get(loc);
//                location.addExit(direction, destination);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }


    public int size() {
        return locations.size();
    }


    public boolean isEmpty() {
        return locations.isEmpty();
    }


    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }


    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }


    public Location get(Object key) {
        return locations.get(key);
    }


    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }


    public Location remove(Object key) {
        return locations.remove(key);
    }


    public void putAll(Map<? extends Integer, ? extends Location> m) {
    }


    public void clear() {
        locations.clear();
    }


    public Set<Integer> keySet() {
        return locations.keySet();
    }


    public Collection<Location> values() {
        return locations.values();
    }

    static class Location {
        private final int locationID;
        private final String description;
        private final Map<String, Integer> exits;

        private Location(int locationID, String description, Map<String, Integer> exits) {
            this.locationID = locationID;
            this.description = description;
            if (Objects.nonNull(exits)) {
                this.exits = new HashMap<>(exits);
            } else {
                this.exits = new HashMap<>();
            }
            this.exits.put("Q", 0);
        }

        public String getDescription() {
            return description;
        }

        public Map<String, Integer> getExits() {
            return new HashMap<>(exits);
        }

        public int getLocationID() {
            return locationID;
        }

        protected void addExit(String direction, int location) { exits.put(direction, location);}
    }
}
