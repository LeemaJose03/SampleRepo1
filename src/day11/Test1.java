package day11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;



	@SuppressWarnings("serial")
	class InvalidAgeException  extends Exception  
	{  
	    public InvalidAgeException (String str)  
	    {  
	        // calling the constructor of parent Exception  
	        super(str);  
	    }  
	}  
	    
	// class that uses custom exception InvalidAgeException  
	public class Test1  
	{  
	  
	    // method to check the age  
	    static void validate (int age) throws InvalidAgeException{    
	       if(age < 18){  
	  
	        // throw an object of user defined exception  
	        throw new InvalidAgeException("age is not valid to vote");    
	    }  
	       else {   
	        System.out.println("welcome to vote");   
	        }   
	     }    
	  
	    // main method  
	    public static void main(String args[])  
	    {  
	        try  
	        {  
	            // calling the method   
	            validate(13);  
	        }  
	        catch (InvalidAgeException ex)  
	        {  
	            System.out.println("Caught the exception");  
	    
	            // printing the message from InvalidAgeException object  
	            System.out.println("Exception occured: " + ex);  
	        }  
	  
	        System.out.println("rest of the code...");    
	    }  
}
