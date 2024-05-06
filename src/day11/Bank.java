package day11;

public class Bank {

	public static void main(String[] args) {
		
		Bank1 obj = new SBI();
		System.out.println(obj.getRateOfInterest());
		Bank1 obj1 = new HDFC();
		System.out.println(obj1.getRateOfInterest());
	}

	
}
	abstract class Bank1{
		
		abstract int getRateOfInterest();
		
		public void show() {
			
			System.out.println("Abstract class");
		}
	}
	
	class SBI extends Bank1{
		
		int getRateOfInterest() {
			
			return 7;
		}
		
	}
	
	class HDFC extends Bank1{

		
		int getRateOfInterest() {
			return 12;
		}
		
	}