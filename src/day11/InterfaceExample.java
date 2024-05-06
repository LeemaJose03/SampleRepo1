package day11;

public class InterfaceExample {

	public static void main(String[] args) {
		
		sample obj = new sample();
		obj.print();
		obj.show();
		obj.msg();

	}

}

interface Printable{
	void print();
	default void msg() {
		System.out.println("default message");
	}
}

interface Showable{
	void show();
}

class sample implements Printable,Showable{
	
	public void print() {
		System.out.println("printing..");
	}
	
	public void show() {
		System.out.println("Shows..");
	}
}