package com.javabrains.exercise_one;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExerciseOneInJava8 {

	public static void main(String[] args) {
		String conditionString = "";
		// Initialize & create data
		List<Person> peopleList = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));
		
		/** 1. Sort List by Last Name using java8 lambda expression
		 * Comparator FI's method : int compare(Person p1, Person p2) is implemented as LMBDE 
		 */
		Collections.sort(peopleList, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		/** 
		 * 2. Create a method that prints all elements in the list
		 * Here, p->true is a LMDE which evaluates to TRUE constantly since we need to print all elements conditionally
		 */
		conditionString = "All People List is as follows:";
		printConditionally(peopleList, p -> true, conditionString);
		
		/** 
		 * 3. Create a method that prints all people having last name starting with 'C'
		 */
		conditionString = "\nPrint people having last name starting with 'C'";
		printConditionally(peopleList, p -> p.getLastName().startsWith("C"), conditionString);
		
	}
	
	private static void printConditionally(List<Person> peopleList, Condition<Person> condition,
			String conditionString) {
		System.out.println(conditionString);
		for (Person person : peopleList) {
			if (condition.test(person)) {
				System.out.println(person);
			}
		}
	}

}
