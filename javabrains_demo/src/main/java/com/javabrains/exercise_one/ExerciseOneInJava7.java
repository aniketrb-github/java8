package com.javabrains.exercise_one;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

/**
 * @author Aniket Bharsakale
 *
 * 
 */
public class ExerciseOneInJava7 {

	public static void main(String[] args) {
		// Initialize & create data
		List<Person> peopleList = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));
		
		System.out.println("\nSorting People based on their Last Names");
		// 1. Sort List by Last Name
		sortByLastName(peopleList);
		
		System.out.println("\nPrinting all people names after sorting:");
		// 2. Create a method that prints all elements in the list
		printAll(peopleList);
		
		System.out.println("\nPrinting People having last name starting with 'C' - tight couple method");
		// 3. Create a method that prints all people that have last name starting with 'C'
		printPeopleWithLastNameInitialC(peopleList);
		
		
		System.out.println("\nPeople with First Name starting with 'C' - using anon  inline inner class impl.");
		// Using the Functional Interface with Anonymous Inner class using java7
		// Print the first names of people starting with 'C'
		printConditionally(peopleList, new Condition() {
			
			@Override
			public boolean test(Person person) {
				return person.getFirstName().startsWith("C");
			}
		});
		
		System.out.println("\nPeople with Last Name starting with 'C' - using anon inline inner class impl");
		// print people, whos last names start with "C"
		printConditionally(peopleList, new Condition() {
			
			@Override
			public boolean test(Person person) {
				return person.getLastName().startsWith("C");
			}
		});
	}

	// this is inflexible code depending on the char 'C' - tightly coupled
	// this can be removed by passing a behavior itself to such method i.e a dynamic condition
	private static void printPeopleWithLastNameInitialC(List<Person> peopleList) {
		for (Person person : peopleList) {
			if(person.getLastName().startsWith("C"))
				System.out.println(person);
		}
	}
	
	// We have created an Anonymous inner class for sorting based on last names
	private static void sortByLastName(List<Person> peopleList) {
	
		// using java.util.Collections.sort(list, comparator); to sort the list
		Collections.sort(peopleList, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}

		});
	}

	private static void printAll(List<Person> peopleList) {
		for (Person person : peopleList) {
			System.out.println(person);
		}
	}
	
	@FunctionalInterface
	interface Condition {
		boolean test(Person person);
	}
	
	// Business Logic for Anon Inner Class usage
	// At Condition u can receive any conditions 
	public static void printConditionally(List<Person> peopleList, Condition condition) {
		for (Person person : peopleList) {
			if (condition.test(person)) {
				System.out.println(person);
			}
		}
	}

}
