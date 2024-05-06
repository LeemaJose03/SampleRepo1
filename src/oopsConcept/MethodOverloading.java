package oopsConcept;

public class MethodOverloading {

	
	
	public String add() {
		
		return "Nothing";
	}

	public int add(int a) {
		
		return a;
	}
	
	public int add(float a) {
		
		return (int) a;
	}
	
	public int add(float a, int b) {
		
		return (int) (a+b);
	}
	
	public int add(int a, int b) {
		
		return a-b;
	}
}
