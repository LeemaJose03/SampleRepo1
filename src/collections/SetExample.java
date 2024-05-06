package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
		
		HashSet<String> hash = new HashSet<String>();
		hash.add("One");
		hash.add("Two");
		hash.add("Three");
		hash.add("four");
		hash.add("five");
		hash.add("six");
		hash.add("seven");
		hash.add("seven");
		
		hash.remove("seven");
		
		Iterator<String> it = hash.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		LinkedHashSet<String> linked = new LinkedHashSet<String>();
		linked.add("Hi");
		linked.add("Hello");
		linked.add("Good morning");
		
		System.out.println("Linked hashset");
		Iterator<String> it1 = linked.iterator();
		
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		TreeSet<Integer> nums = new TreeSet<Integer>();
		nums.add(20);
		nums.add(30);
		nums.add(10);
		nums.add(5);
		
		System.out.println("Treeset");
		Iterator<Integer> it2 = nums.iterator();
		
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}

	}

}
