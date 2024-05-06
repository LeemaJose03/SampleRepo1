package day13;


@SuppressWarnings("serial")
class InvalidAgeException extends Exception {
	
	public InvalidAgeException(String str) {
		
		super(str);
	}
}
public class TestThrow {

	static void validateAge(int age) throws InvalidAgeException {
		
		if (age < 18) {
			 
			
			throw new InvalidAgeException("Invalid age");
		}
		else {
			
			System.out.println("Eligible to vote");
		}
		 
	}
	public static void main(String[] args) {
		
		try {
			validateAge(13);
		} catch (InvalidAgeException e) {
			System.out.println("Invalid age exception occured" + e);
		}

	}

}
