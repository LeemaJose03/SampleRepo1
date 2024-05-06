package oopsConcept;

public class Calc {

  int num1;
	 int num2;
	 int result; //variable 
	
	public void add(int num1,float num2) {  //method
		
		result = (int) (num1+num2);  //type casting
		System.out.println("The addition of " +num1+ " and " +num2+ " is: "+result);
		
	}
	
	public void sub() {
		
		int num1=20;
		int num2=10;
		int result; 
		
		result=num1 - num2;
		System.out.println("The sub of " +num1+ " and " +num2+ " is: "+result);
	}
	
	public void sub1() {

		
		result=num1 - num2;
		System.out.println("The sub of " +num1+ " and " +num2+ " is: "+result);
	}
	static int mul() {
		
		int num1 = 0;
		 int num2 = 0;
		 int result;
		result = num1 * num2;
		System.out.println("I'm from mul method"  + result);
		return result;
		
		
		
		
	}
	
	
	static void div() {
		
		int num1=20;
		int num2=10;
		int result; 
		result = num1 / num2;
		System.out.println("The div of " +num1+ " and " +num2+ " is: "+result);
	}
	
	
	

}
