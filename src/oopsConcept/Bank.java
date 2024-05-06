package oopsConcept;

public class Bank {

	public int getRateOfIntrest(){
		
		return 0;
	}

}

class SBI extends Bank{
	
	public int getRateOfIntrest(){
		
		return 15;
	}
}

class ICICI extends Bank{
	
	public int getRateOfIntrest(){
		
		return 10;
	}
}

class HDFC extends Bank{
	
	public int getRateOfIntrest(){
		
		return 12;
	}
}