package day11;

public class AbDemo {

	public static void main(String[] args) {
		
		MaheshPhone obj = new RameshPhone();//cannot instantiate the abstract class
		obj.call();
		obj.move();
		obj.dance();
		obj.microwave();

	}
}
	abstract class MaheshPhone{      //Abstract class
		
		public void call() {
			
			System.out.println("Calling..");
		}
		
		public abstract void move();
		public abstract void dance();
		public abstract void microwave();
	}
	
	abstract class SureshPhone extends MaheshPhone   //Abstract class
	{
		public void move() {
			System.out.println("Moving..");
		}
	}
	
	class RameshPhone extends SureshPhone{     //Concrete class
 
		
		public void dance() {
			
			System.out.println("Dancing..");
			
		}


		public void microwave() {
			
			System.out.println("Cooking..");
		}
		
		
		
}

