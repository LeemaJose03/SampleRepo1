package day11;

public class Test {

	public static void main(String[] args) {
		
		C obj=new C();
		obj.a();
		obj.b();
		obj.c();
		obj.d();

	}

}

interface A{
	
	void a();
	void b();
	void c();
	void d();
	
}

abstract class B implements A{
	
	public void c() {
		System.out.println("C method");
	}
}

class C extends B{
	
	public void a() {
		System.out.println("A method");
	}
	
	public void b() {
		System.out.println("B method");
	}
	
	public void d() {
		System.out.println("D method");
	}

	
}
