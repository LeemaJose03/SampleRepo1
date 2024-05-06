package day13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExcepTest {

	public static void main(String[] args) throws FileNotFoundException {
		
		int i=3,j=0,k=0;
		String s=null;
		
		try {
			
			k = 25/0;

		
		} 
		 catch(ArrayIndexOutOfBoundsException ie) {
			
			System.out.println("Array index out of bound");
			
		} catch (Exception e) {
			
		}

		finally {
			System.out.println("Try block");
		}
		System.out.println(k);
		
	}

}
