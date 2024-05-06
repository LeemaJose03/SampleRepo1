package javaproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SortByWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Input the size of arrays
        int N = scanner.nextInt();

        int[] numbers = new int[N];
        int[] weights = new int[N];

        // Input array of N integers and their corresponding weights
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            weights[i] = scanner.nextInt();
        }

        // Create a list of custom objects to store number, weight pairs
        List<Pair> pairs = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            pairs.add(new Pair(numbers[i], weights[i]));
        }

        // Sort the list of pairs based on weights in ascending order
        Collections.sort(pairs, Comparator.comparingInt(a -> a.weight));

        // Output the sorted numbers based on weights
        for (Pair pair : pairs) {
            System.out.print(pair.number + " ");
        }
    }

    // Pair class to store number and weight together
    static class Pair {
        int number;
        int weight;

        Pair(int number, int weight) {
            this.number = number;
            this.weight = weight;
        }
    
	}

}
