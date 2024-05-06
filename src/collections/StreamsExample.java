package collections;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamsExample {

	public static void main(String[] args) {
		

		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(10);
		nums.add(8);
		nums.add(1);
		nums.add(2);  // add the element
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		
		nums.forEach(n -> System.out.println(n));
		
		// 4 6 8
		
		Stream<Integer> str = nums.stream();

		Stream<Integer> filter = str.filter(n -> n%2==0);
		Stream<Integer> map = filter.map(n -> n*2);
		Stream<Integer> sorted = map.sorted();
		//sorted.forEach(n -> System.out.println(n));  // ->
		
		nums.stream()
			.filter(n -> n%2==0)
			.map(n -> n*2)
			.sorted()
			.forEach(n -> System.out.println(n));
		
		
			System.out.println("Original list" + nums);
		
		
		
		//str.forEach(n -> System.out.println(n));

	}

}
