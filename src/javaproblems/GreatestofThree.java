package javaproblems;

import java.util.Scanner;

public class GreatestofThree {

	public static void main(String[] args) {
		
//		Scanner obj = new Scanner(System.in);
//		
//		int a = obj.nextInt();
//		int b = obj.nextInt();
//		int c = obj.nextInt();
//		
//		if(a>= b && a >=c) {
//			
//			System.out.println("A is greater");
//		} else if (b>=a && b>= c) {
//			
//			System.out.println("B is greater");
//		} else {
//			
//			System.out.println("C is greater");
//		}

		
		Scanner sc = new Scanner(System.in);
        double celsius=sc.nextDouble();
        
        double farenheit= ( celsius * 1.8 ) +32;
        
        System.out.printf("%.2f", farenheit);
	}

}
