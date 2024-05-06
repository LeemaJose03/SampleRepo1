package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String arr[] = {"abc" , "cde" ,"rfd"};
//		
//		List<String> asList = Arrays.asList(arr);
//		
//		System.out.println(asList);
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Guvi");  // add the element
		names.add("Geek");
		names.add("Zen");
		names.add("Class");
		
		//using toArray()
		
		String[] arr = names.toArray(new String[names.size()]);
		
		
//		for (int i = 0; i <names.size(); i++) {
//			
//			arr[i] = names.get(i);
//		}
		
		for( String a : arr) {
			System.out.println(a);
		}
	}

}
