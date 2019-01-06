package com.javabrains.exercise_one;

import java.util.Arrays;
import java.util.List;import org.omg.Messaging.SyncScopeHelper;

public class ExerciseOneInJava8 {

	public static void main(String[] args) {
		// Initialize & create data
		List<Person> peopleList = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));
		
		// 1. Sort List by Last Name
		
		// 2. Create a method that prints all elements in the list
		printAllElements(peopleList);
		
		// 3. Create a method that prints all people that have last name starting with 'C'
		
		
	}

	private static void printAllElements(List<Person> peopleList) {
		peopleList.forEach(person -> System.out.print(" "+person.getFirstName()+""+person.getLastName() ) );
		
	}

}
