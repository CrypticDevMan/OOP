//package com.company.javaio.files;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Objects;
//
///**
// * Created by crypticdev on 2/28/16.
// */
//public class Location {
//    private final int locationID;
//    private final String description;
//    private final Map<String, Integer> exits;
//
//    public Location(int locationID, String description, Map<String, Integer> exits) {
//        this.locationID = locationID;
//        this.description = description;
//        if (Objects.nonNull(exits)) {
//            this.exits = new HashMap<>(exits);
//        } else {
//            this.exits = new HashMap<>();
//        }
//        this.exits.put("Q", 0);
//    }
//
////    public void addExit(String direction, int location) {
////        exits.put(direction, location);
////    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public Map<String, Integer> getExits() {
//        return new HashMap<>(exits);
//    }
//
//    public int getLocationID() {
//        return locationID;
//    }
//}
