package javaproblems;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		
//		int a = 1;
//		int b = 10;
//		
//		if(a>b) {
//			
//			System.out.println("A is greater");
//		} else {
//			
//			System.out.println("B is greater");
//		}
		
		// positive or negative number
		
//		int num = 0;
//		
//		if(num >0) {
//			System.out.println("Positive");
//			
//		} else if (num < 0) {			
//			System.out.println("Negative");
//		} else {
//			System.out.println("Zero");
//		}
		
		Scanner obj = new Scanner(System.in);
		
		String word = obj.next();
		// guvi - g u v i  - 0 1 2 3
		//System.out.println(word.length());   // 1 2 3 4
		
		for(int i =0; i <= word.length()-1; i++) {
			
			if(i == word.length()-1) {
			System.out.print(word.charAt(i));
			} else {
				
				System.out.print(word.charAt(i)+" ");
			}
			
		}
		
		
		
		

	}

}
