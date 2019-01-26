package com.javabrains.forEachLoop;

import java.util.Arrays;
import java.util.List;

import com.javabrains.exercise_one.Person;

public class ForEachIterationDemo {

	public static void main(String[] args) {
		// Initialize & create data
		List<Person> peopleList = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));
		
		/**
		 * Traditional For Loop & the For In Loop are Sequential Processing of Data
		 */
		System.out.println("Printing with Traditional for loop");
		for(int i=0; i< peopleList.size(); i++) {
			System.out.println(peopleList.get(i));
		}
		
		System.out.println("Printing with For-In loop");
		for(Person p : peopleList) {
			System.out.println(p);
		}
		
		/**
		 * Using Java8 ForEach loop, the data is processed in multiple threads
		 * Here the order is not sequential & un-ordered
		 */
		// For Each Java8
		System.out.println("Printing using the for each of java8 loop: ");
		peopleList.forEach(p -> System.out.println(p));
		
		// Using Method reference
		System.out.println("Using Method Reference");
		peopleList.forEach(System.out :: println);
		
	}

}
