package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class ListSample {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Guvi");  // add the element
		names.add("Geek");
		names.add("Zen");
		names.add("Class");
		
		System.out.println("Before sorting" + names);
		TreeSet<String> sort = new TreeSet<String>(names);
		
		System.out.println("After sorting" + sort);
		
		ArrayList<Integer> names1 = new ArrayList<Integer>();
		names1.add(20);  // add the element
		names1.add(30);
		names1.add(10);
		names1.add(1);
		
		
		System.out.println(names.size());
		System.out.println(names);
		System.out.println(names.get(0));  // access the element
		names.set(3, "Portal");  // change an item
		System.out.println(names);
		System.out.println(names.get(3));
		//names.remove(3);   // remove an element
		System.out.println(names);
		//names.clear();
		//System.out.println("The list is cleared" +names);
		
		//To sort arraylist
		
		Collections.sort(names);
		
		System.out.println("Collections sorting" +names);
		
		
		for(int i : names1) {
			System.out.println(i);
		} 
		
		/*for (int i=0;i<names.size();i++) {
			
			System.out.println(names.get(i));
		}*/
		
		/*
		Iterator<String> it = names.iterator();
		
		while(it.hasNext()) {  // Guvi -> Geek (true)  
			
		System.out.println(it.next()); 
		
		}*/
		
		System.out.println("******************************");
		System.out.println("Linked list");
		System.out.println();
		
		LinkedList<Integer> link = new LinkedList<Integer>();
		link.add(20);
		link.add(30);
		link.add(40);
		link.add(10);
		
		System.out.println(link);
		link.remove(1);
		link.removeFirst();
		System.out.println(link);
		
		System.out.println("******************************");
		System.out.println("Vector");
		System.out.println();
		
		Vector<String> vec = new Vector<String>();
		vec.add("Tiger");
		vec.add("Lion");
		vec.add("Dog");
		vec.add("Dog");
		
		vec.addElement("Elephant");
		
		
		System.out.println(vec);
		vec.remove(1);
		System.out.println(vec.size());
		
		if(vec.contains("Tiger")) {
			System.out.println("Present");
		}
		

		System.out.println("*********************************");
		System.out.println("Stack");
		System.out.println();
		
		Stack<Integer> nums = new Stack<Integer>();
		
		nums.push(101);  // to add the element
		nums.push(102);
		nums.push(103);
		nums.push(104);
		
		
		System.out.println("The original list" + nums);
		//System.out.println("The top most element" + nums.peek());  // to retreive the top most
		
		nums.pop();
		
		System.out.println(nums.empty());
		
		System.out.println("The list after pop" + nums);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
