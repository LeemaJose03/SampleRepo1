package javaproblems;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		int rows = obj.nextInt();
		int cols = obj.nextInt();
//		int k=1;
//		
//		for(int i=1; i<= n; i++) {
//			
//			for(int j=1;j<=i;j++) {
//				if(i > j) {
//				System.out.print(k + " ");
//				} else System.out.print(k);
//				k++;
//			}
//			System.out.println();
//		}
		
//		for(int i=n; i>=1; i--) {
//			
//			for (int j=1;j<=i;j++) {
//				
//				if(j == 1 || j == i || i == n) {
//				System.out.print(j);
//				} else System.out.print(" ");
//				
//			}
//			
//			System.out.println();
//		}

		for(int i=1; i<=rows ; i++) {
			
			for(int j=1; j<=cols;j++) {
				
				if( i ==1 || i == rows || j ==1 || j==cols) {
					
					System.out.print("*");
					if(j<cols) {
						System.out.print(" ");  // * 
					}
				} else System.out.print("  ");
			}
			System.out.println();
		}
	}

}
