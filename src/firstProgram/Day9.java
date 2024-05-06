package firstProgram;

import java.util.Scanner;

public class Day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the value:");
		int value = obj.nextInt();  // 5 
		
		int fact = 1;
		
		for(int i=1; i<=value;i++) {
			
			fact = fact * i;    // starting from 1 till n it will multiply. 
			
		}
		
		System.out.println(fact);
		
		
		
		
		
//		// child (<13) teenager (<20) adult (<40) oldage (<60)
//		
//		// else if ladder
//		
//		
//		
//		if(value >1 && value <=13) {
//			System.out.println("Child");
//		} else if(value >13 && value <=20) {
//			System.out.println("Teenager");
//		} else if(value >20 && value <=40) {
//			System.out.println("Adult");
//		} else if(value >40 && value <=60) {
//			System.out.println("Oldage");
//		}
//		else {
//			System.out.println("Invalid input");
//		}
//		
//		
		obj.close(); 
	}
	

}
