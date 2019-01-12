package com.javabrains.exercise_one;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

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
		
		/**
		 * 4. Create a method that prints all people having first name starting with 'C'
		 * We've used here Predicate FI : boolean test(T t) and
		 * the Consumer FI : void accept(T t)
		 */
		System.out.println("\nPrinting people having 1st name with 'C' & using Predicate ");
		printConditionallyWithInBuiltFI(peopleList, p -> p.getFirstName().startsWith("C"),  p -> System.out.println(p));
		
		System.out.println("\nPrinting people having 1st name with 'C' & using Streams");
		printConditionallyUsingStream(peopleList, p -> p.getFirstName().startsWith("C"),  p -> System.out.println(p));
	}
	
	/**
	 * Here we used our user defined functional interface 
	 */
	private static void printConditionally(List<Person> peopleList, Condition<Person> condition,
			String conditionString) {
		System.out.println(conditionString);
		for (Person person : peopleList) {
			if (condition.test(person)) {
				System.out.println(person);
			}
		}
	}
	
	/**
	 * Here we used the Predicate & Consumer FI upon the collection which is sent along
	 * but with the traditional for-each loop
	 */
	private static void printConditionallyWithInBuiltFI(List<Person> peopleList, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		for (Person person : peopleList) {
			if (predicate.test(person))
				consumer.accept(person);
		}
	}
	
	/**
	 * Here we used the java.util.stream.Stream<T>
	 */
	private static void printConditionallyUsingStream(List<Person> peopleList, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		peopleList.stream().filter(p -> predicate.test(p)).sequential().forEach(consumer);
	}

}
