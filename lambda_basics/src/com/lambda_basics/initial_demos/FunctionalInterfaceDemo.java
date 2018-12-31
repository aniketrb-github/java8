package com.lambda_basics.initial_demos;

import java.util.Scanner;

/**
 * @author abharsa
 * In this program, we define a very simple Functional Interface
 * & just below in the main, we provide this interface a implementation via a LambdaExpression
 */
public class FunctionalInterfaceDemo {
	
	/**
	 * A Functional Interface can have only 1 abstract method
	 * but can have multiple default methods of its own.
	 */
	@FunctionalInterface
	interface Square {
		int calculateSquare(int number);
		
		//A Default method inside a Functional Interface
		default void greet() {
			System.out.println("Welcome to the Square Program.");
		}
		
		default String conclude() {
			return "Thanks for watching and See you again.";
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// lambda expression providing an implementation to a functional interface
		Square square = number -> number * number;
		
		square.greet();
		
		System.out.println("Please enter your desired number & press enter:");
		int inputNumber = in.nextInt();
		System.out.println("Square of "+inputNumber+" is : "+square.calculateSquare(inputNumber));
		System.out.println(square.conclude());
		
		in.close();
	}

}
