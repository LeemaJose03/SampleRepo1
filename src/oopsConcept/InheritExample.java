package oopsConcept;

import java.util.Scanner;

public class InheritExample {


	public static void main(String[] args) {
		
		/*SBI sobj = new SBI();
		ICICI iobj = new ICICI();
		HDFC hobj = new HDFC();
		
		System.out.println("Sbi: " + sobj.getRateOfIntrest());
		System.out.println("ICICI: " + iobj.getRateOfIntrest());
		System.out.println("hdfc: " + hobj.getRateOfIntrest()); 
		*/
		
		/*MethodOverloading obj = new MethodOverloading();
		System.out.println(obj.add());
		System.out.println(obj.add(2f));
		System.out.println(obj.add(5));
		System.out.println(obj.add(5f, 3));
		System.out.println(obj.add(10, 15)); */
		
		Encapsulation obj = new Encapsulation();
		Scanner sc = new Scanner(System.in);
		
		
		int roll= sc.nextInt();
		String name1 = sc.next();

		obj.setRollno(roll);
		obj.setName(name1);
		System.out.println(obj.getRollno());
		System.out.println(obj.getName());
		
		
		
	}

}
