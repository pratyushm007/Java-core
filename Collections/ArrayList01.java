package Collections;

import java.util.ArrayList;

/**
 * ArrayList Basics
 * Learning: Dynamic arrays in Java
 */
public class ArrayList01 {
    public static void main(String[] args) {
        // Creating ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Java");
        list.add("Python");
        list.add("JavaScript");

        // Accessing elements
        System.out.println("First element: " + list.get(0));

        // Size
        System.out.println("Total elements: " + list.size());

        // Iterating
        System.out.println("\nAll elements:");
        for(String lang : list) {
            System.out.println("- " + lang);
        }

        // Remove element
        list.remove("Python");
        System.out.println("\nAfter removing Python: " + list);
    }
}