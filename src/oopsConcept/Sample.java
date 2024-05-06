package oopsConcept;

public class Sample {

public static void main(String[] args) {
		
		Calc obj = new Calc();  //object creation  
		Calc obj1 = new Calc();
		//reference
		
		System.out.println(obj);
		System.out.println(obj1);
		
		//instance of a class
		obj.num1=10;
		obj.num2=20;
		obj.add(20,30f);
		//obj.sub();
		//obj.sub1();
		Calc.mul();
		//System.out.println("The mul value is " +obj.mul()); // num1 * num2 
		

	}
}
