package javaproblems;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
// Read the size of the array
int n = scanner.nextInt();

// Read the elements of the array
int[] array = new int[n];
for (int i = 0; i < n; i++) {
    array[i] = scanner.nextInt();
}

// Create a HashMap to count the occurrences of each element
Map<Integer, Integer> frequencyMap = new HashMap<>();
for (int num : array) {
    frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
}

// Find the least occurring frequency
int minFrequency = Collections.min(frequencyMap.values());

// Print the elements with the least occurring frequency
for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
    if (entry.getValue() == minFrequency) {
        System.out.print(entry.getKey() + " ");
    }
}

scanner.close();

	}

}
