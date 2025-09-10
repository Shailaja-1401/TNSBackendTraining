package com.tns.threads;

import java.util.*;   // Import collection framework

public class CollectionDemo {   // ✅ renamed class
    public static void main(String[] args) {

        // Using java.util.Collection<E>
        Collection<String> names = new ArrayList<>();
        names.add("siri");
        names.add("vaishu");
        names.add("shailu");
        names.add("ammu");

        System.out.println("Original Collection: " + names);

        List<String> nameList = new ArrayList<>(names);

        Collections.sort(nameList);
        System.out.println("After Sorting: " + nameList);

        Collections.reverse(nameList);
        System.out.println("After Reversing: " + nameList);

        System.out.println("Max: " + Collections.max(nameList));
        System.out.println("Min: " + Collections.min(nameList));
    }
}
