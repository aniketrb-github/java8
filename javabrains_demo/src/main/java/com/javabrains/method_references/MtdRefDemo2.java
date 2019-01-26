package com.javabrains.method_references;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import com.javabrains.exercise_one.Person;

public class MtdRefDemo2 {

	public static void main(String[] args) {
		// Initialize & create data
		List<Person> peopleList = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));
		
		/**
		 * 4. Create a method that prints all people having first name starting with 'C'
		 * We've used here Predicate FI : boolean test(T t) and
		 * the Consumer FI : void accept(T t)
		 */
		System.out.println("\nPrinting people having 1st name with 'C' & using Predicate ");
		//printConditionallyWithInBuiltFI(peopleList, p -> p.getFirstName().startsWith("C"),  p -> System.out.println(p));
		
		// invoking a instance method via Method Reference
		// p -> System.out.println(p) === System.out :: println
		printConditionallyWithInBuiltFI(peopleList, p -> p.getFirstName().startsWith("C"),  System.out :: println);
		
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
}
