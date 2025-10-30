package Day7Collections;

import java.util.*;

public class Arraylist {  // allowing duplicates
    public static void main(String[] args) {
        // Create a list (allows duplicates and maintains insertion order)
        List<String> list = new ArrayList<>();

        // Add elements (including duplicates)
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");

        // Print elements in insertion order
        System.out.println("Elements in insertion order (duplicates allowed):");
        for (String item : list) {
            System.out.println(item);
        }
    }
}
