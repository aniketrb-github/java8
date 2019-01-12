package com.javabrains.collectionOps;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Converting List into Map using Java8 forEach
 * @author Aniket Bharsakale
 *
 */
public class ListToMapUsingStream {

	public static void main(String[] args) {
		
		Map<Integer, Employee> empMap = new HashMap<>();
		
		// Populate List for Employee Objects
		List<Employee> empList = Arrays.asList( 
				new Employee(1222, "Suresh Sharma", "Patna", "Associate"),
				new Employee(6321, "Rajesh Verma", "Pune", "Jr. Associate"),
				new Employee(1452, "Rahul Choudhary", "Thane", "Sr. Associate"),
				new Employee(1342, "Yuvraj Rathod", "Kashmir", "Lead"),
				new Employee(1555, "Adil Khan", "Kerala", "Specialist")
				);
		
		// Prints List using Consumer<T> : void accept(T t)
		System.out.println("Printing List using lambda forEach()");
		empList.forEach(e -> System.out.println(e));
		
		// Converts List to Map using Consumer<T> : void accept(T t)
		System.out.println("Converting List into Map using forEach");
		empList.forEach(e -> empMap.put(e.getId(), e));
		
		// Print the Map BiConsumer<K,V> : void accept(K k, V v)
		System.out.println("Printing Employee Map using ");
		empMap.forEach((K, V) -> System.out.println(K+"----"+V) );
	}

}
