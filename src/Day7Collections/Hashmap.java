package Day7Collections;

import java.util.*;

public class Hashmap {
    public static void main(String[] args) {

        // Create a Map with String keys and Integer values
        Map<String, Integer> marks = new HashMap<>();

        // Add key-value pairs
        marks.put("Math", 90);
        marks.put("Science", 85);
        marks.put("English", 88);
        marks.put("History", 75);

        // Print the entire map
        System.out.println("Complete Map: " + marks);

        System.out.println("\n--- Printing Key-Value Pairs ---");
        // Loop through the map entries
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println("Subject: " + entry.getKey() + " | Marks: " + entry.getValue());
        }
    }
}
