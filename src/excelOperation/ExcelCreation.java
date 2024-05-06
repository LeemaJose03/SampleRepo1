package excelOperation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExcelCreation {

	public static void main(String[] args) {
		
		
		try {
			// create an object for file
			File file = new File("D:\\EclipseClass\\FirstProject\\src\\excelOperation\\test.txt");
			
			// created new file
			boolean isFileCreated=file.createNewFile();
			if(isFileCreated) {
				
				System.out.println("File created");
			} else {
				System.out.println("File not created");
			}
			
			// create a FileWriter object and assign the file object
			FileWriter writer = new FileWriter(file);
			/*BufferedWriter bw = new BufferedWriter(writer);
			
			bw.write("Hello World", 0, 11);
			
			bw.close(); */
			
			//write data inside file
			writer.write("My first line");
			writer.write("My second line");
			
			//close the writer
			writer.close();
			
			//Reading the data from the file
			
			FileReader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);
			
			String text;
			
			while((text=br.readLine())!=null) {
				System.out.println(text);
			}
			
			br.close();
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
