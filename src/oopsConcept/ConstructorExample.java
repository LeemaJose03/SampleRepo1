package oopsConcept;

public class ConstructorExample {

	int a;
	int b;
	
	
	public ConstructorExample() {
		a=10;
		b=20;
	}
	
	public ConstructorExample(int n1, int n2) {
		a=n1;
		b=n2;
	}
	
	public void add() {
		
		System.out.println(a+b);
		
	}
	
	public static void main(String[] args) {
		
		ConstructorExample obj = new ConstructorExample(50,50);
		obj.add();
		ConstructorExample obj1 = new ConstructorExample();
		obj1.add();
	}

}
