package javaproblems;

import java.util.Scanner;

public class MirrorArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        
	        int[] arr1 = new int[N];
	        int[] arr2 = new int[N];
	        
	        for (int i = 0; i < N; i++) {
	            arr1[i] = sc.nextInt();
	        }
	        
	        for (int i = 0; i < N; i++) {
	            arr2[i] = sc.nextInt();
	        }
	        
	        boolean mirror = true;
	        
	        for (int i = 0; i < N; i++) {
	            if (arr1[i] != arr2[N - 1 - i]) {
	                mirror = false;
	                break;
	            }
	        }
	        
	        if (mirror) {
	            System.out.println("yes");
	        } else {
	            System.out.println("no");
	        }
	}

}
