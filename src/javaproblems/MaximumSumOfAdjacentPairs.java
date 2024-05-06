package javaproblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaximumSumOfAdjacentPairs {

	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int N = scanner.nextInt();
	        int[] array = new int[N];

	        for (int i = 0; i < N; i++) {
	            array[i] = scanner.nextInt();
	        }
	        scanner.close();

	        List<Integer> list = new ArrayList<>();
	        for (int num : array) {
	            list.add(num);
	        }

	        List<List<Integer>> permutations = new ArrayList<>();
	        permute(list, 0, N, permutations);

	        int maxSum = 0;
	        for (List<Integer> perm : permutations) {
	            int sum = 0;
	            for (int i = 0; i < perm.size() - 1; i++) {
	                sum += Math.max(perm.get(i), perm.get(i + 1));
	            }
	            maxSum = Math.max(maxSum, sum);
	        }

	        System.out.println("Maximum sum of adjacent pairs: " + maxSum);
	    }

	    private static void permute(List<Integer> list, int start, int end, List<List<Integer>> permutations) {
	        if (start == end) {
	            permutations.add(new ArrayList<>(list));
	        } else {
	            for (int i = start; i < end; i++) {
	                Collections.swap(list, start, i);
	                permute(list, start + 1, end, permutations);
	                Collections.swap(list, start, i);
	            }
	        }
	    }
}
