package codekataProblems;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ArraySamples {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println(isBeatiful(s));
    }
	
	public static int isBeatiful(String s) {
		
		int length = s.length();
		
		// Check if the string has at least 3 characters
		if(length < 3) {
			return 0;
		} 
		
		// check if the first character is 'a' or 'A'
		
		if(s.charAt(0) !='a' && s.charAt(0) !='A' ) {
			return 0;
		}
		
		//check if the middle character is 'm' or 'M'
		char middleChar = s.charAt(length/2);
		if(middleChar != 'm' && middleChar != 'M') {
			return 0;
		}
		
		//check if the last character is 'z' or 'Z'
		if(s.charAt(length-1) != 'z' && s.charAt(length-1) != 'Z'){
			return 0;
		}
		
		return 1;
		
		
	}
	
	
}
