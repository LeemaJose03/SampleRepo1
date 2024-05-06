package firstProgram;

public class Array {

	public static void main(String[] args) {
		
		int[] numbers = {10,20,30,40,50};
		String[] names= {"Jasina","Anbu","Vignesh","Kavin"};
		
		// length  - using this we can get the array size.
		
		System.out.println(numbers.length);
		for(int i=0; i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("\n");
		for(String num:names) {
			System.out.println(num);
		}
		

	}

}
