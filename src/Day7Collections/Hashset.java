package Day7Collections;

import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        // Input values with duplicates
        int[] numbers = {10, 20, 30, 10, 20, 40, 50};

        // LinkedHashSet removes duplicates & keeps order
        Set<Integer> uniqueNumbers = new LinkedHashSet<>();

        // Add all elements
        for (int n : numbers) {
            uniqueNumbers.add(n);
        }

        // Print the result
        System.out.println("Unique values in insertion order: " + uniqueNumbers);
    }
}
