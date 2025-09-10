package com.tns.threads;

import java.util.*; 
// for Map, HashMap, etc.

public class Mapimplementation {

    public static void main(String[] args) {
        // Create a Map
        Map<String, Integer> mp = new HashMap<>();

        // Add the elements -> put
        mp.put("ds", 40);
        mp.put("ai", 50);
        mp.put("ml", 64);
        mp.put("cc", 78);
        mp.put("cd", 82);

        // Iterate through the map
        for (Map.Entry<String, Integer> e : mp.entrySet()) {
            String key = e.getKey();
            int value = e.getValue();
            System.out.println(key + " -> " + value);
        }
    }
}
