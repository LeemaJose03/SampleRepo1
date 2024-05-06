package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		
		
		Hashtable<Integer, String> stud = new Hashtable<Integer, String>();
		stud.put(101, "Arun");
		stud.put(102, "Akash");
		stud.put(103, "Priya");
		stud.put(104, "Akash");
		stud.put(105, "Priya");
		
		System.out.println(stud);
		
		
	
		
		for(Integer key :stud.keySet()) {
			
			System.out.println(stud.get(key));
		}
		
		
		System.out.println("*******************************");
		
		for(Map.Entry entry : stud.entrySet()) {   // entry  -> Key and value 
			
			//101 : Leema
			
			System.out.println(entry.getValue());
		}
		
		stud.remove(105);
		System.out.println(stud);
		
		stud.replace(104, "Akash", "Jo");
		System.out.println(stud);
		
		System.out.println(stud.containsKey(106));
		
		System.out.println("*********************************");
		System.out.println("Linked Hash Map");
		System.out.println("*********************************");
		
		Map<String, Integer> link = new LinkedHashMap<String, Integer>();
		link.put("Leema", 50);
		link.put("Jasina", 79);
		link.put("Vignesh", 80);
		link.put("Akash", 80);
		link.put(null, null);
		link.put(null, 90);
		
		
		
		for(Map.Entry entry : link.entrySet()) {
			
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		
		

	}

}
