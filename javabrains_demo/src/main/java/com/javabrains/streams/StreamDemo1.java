package com.javabrains.streams;

import java.util.Arrays;
import java.util.List;

import com.javabrains.exercise_one.Person;

public class StreamDemo1 {

	public static void main(String[] args) {
		// Initialize & create data
		List<Person> peopleList = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39),
				new Person("Kane", "Arington", 22));
		
		System.out.println("People with first name starting with C");
		peopleList.stream()								// generates the assembly line of elements
		.filter(p -> p.getFirstName().startsWith("C"))	// filters & creates a new stream 
		.forEach(p -> System.out.println(p));			// iterates on the new latest stream
		
		long count = peopleList.stream()
		.filter(p -> (p.getAge() > 25))
		.filter(p -> p.getFirstName().startsWith("C"))
		.count();
		System.out.println("\nCount the people with Age Greater than 25 & FirstName starting with C:\n"+count);
		
	}

}
