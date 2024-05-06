package second;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Classtea {
	public static void main(String[] args) {
		TreeMap<Integer, String> tree=new TreeMap<Integer, String>();
	     tree.put(45874, "bala");
	     tree.put(58057, "Ajayapatel");
	     tree.put(12345, "patelkumar");
	     tree.put(47854, "pradeep");
	     tree.put(78920, "Arunkumar");
	     
	     System.out.println(tree);
	     System.out.println("print the name only : ");
	    
	     for (Integer name : tree.keySet()) {
	    	 System.out.println(tree.get(name));
			
		}
    }	
	
	
}
