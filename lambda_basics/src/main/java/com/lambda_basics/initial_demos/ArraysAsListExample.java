package com.lambda_basics.initial_demos;

import java.util.Arrays;
import java.util.List;

/**
 * @author Aniket Bharsakale
 */
public class ArraysAsListExample {
	
	/**
	 * Arrays.asList(...); returns a fixed sized list backed by a specified array.
	 * The spcified array(catching container) must have the same type as mentioned in Array.asList(...) 
	 * @param s
	 */
	public static void main(String s[]) {
		List<String> list = Arrays.asList("ram", "sam", "dane");
		System.out.println("List Elements: "+list);
		
		List<? extends Object> list2 = Arrays.asList("ram", "sam", 9);
		System.out.println("List Elements: "+list2);
	}
}
