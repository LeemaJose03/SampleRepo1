package javaproblems;

public class ForLoopExample {

	
	  int a;
	
	public  void getA(int a) {
		
		this.a =a;
		System.out.println(a);
	}
	public static void main(String[] args) {
		
		ForLoopExample obj= new ForLoopExample();
		obj.getA(5);
		// For loop
//		for(int i=1; i<=10 ; i++) {
//			
//			System.out.println(i);
//		}
		
		// while loop
		
//		int i=1;
//		while(i<=10) {
//			
//			System.out.println(i);
//			i++;
//		}
		
		// do while loop
		
//		int i = 1;
//		
//		do {
//			
//			System.out.println(i);
//			i++;
//		} while (i<= 10);

		
//			int a =5;  //  000000101    - 1111111010   - -6
//			
//			// & | ~ 6
//			
//			System.out.println(~a);
	}

}
