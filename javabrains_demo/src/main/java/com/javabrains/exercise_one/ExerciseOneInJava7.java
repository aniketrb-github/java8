package com.javabrains.exercise_one;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExerciseOneInJava7 {

	public static void main(String[] args) {
		// Initialize & create data
		List<Person> peopleList = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));
		
		// 1. Sort List by Last Name
		sortByLastName(peopleList);
		
		// 2. Create a method that prints all elements in the list
		printAll(peopleList);
		System.out.println();
		
		// 3. Create a method that prints all people that have last name starting with 'C'
		printPeopleWithLastNameInitialC(peopleList);
		
	}

	private static void printPeopleWithLastNameInitialC(List<Person> peopleList) {
		for (Person person : peopleList) {
			if(person.getLastName().startsWith("C"))
				System.out.println(person);
		}
	}

	// We have created an Anonymous inner class for sorting based on last names
	private static void sortByLastName(List<Person> peopleList) {
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

}
