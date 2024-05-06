package firstProgram;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int i=3;
		
		while(i>=2 && i<=4) {
			System.out.println(i);
			i++;  // 1 ++ = 1+1 =2
		}*/
		
		/*for(intialize;conditon;increment/decremtent) {
			
			block of code;
		}*/
		
		/*for(int i=1;i<=5;i++) {  // iteration   // i=1 i=2 i=3
			for(int j=1;j<=i;j++) {  // printing the value
				if(j==i) {  //i=2 , j=2
					System.out.print("*");
				} else {
				System.out.print("*"+" "); 
				}
			}
			System.out.println();
		}*/
		
		int i=1;
		
		do {
			System.out.println(i);
			i++;
		} while(i<0);
		
		
	}

}
