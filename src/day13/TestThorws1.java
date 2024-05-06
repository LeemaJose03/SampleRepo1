package day13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestThorws1 {

	
	void m() throws IOException {
		
		throw new IOException("device error");
	}
	
	void n() throws FileNotFoundException  {
		

		FileInputStream file = new FileInputStream("test.txt");
		
	}
	
	void p() {
		try {
			n();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		TestThorws1 obj = new TestThorws1();
		obj.p();
		System.out.println("normal flow..");
		
	}

}
