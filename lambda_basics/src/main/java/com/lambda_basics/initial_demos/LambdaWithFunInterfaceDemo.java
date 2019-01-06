package com.lambda_basics.initial_demos;

import java.util.Scanner;

/**
 * @author Aniket Bharsakale
 *
 * 
 */
public class LambdaWithFunInterfaceDemo {

	@FunctionalInterface
	interface Square {
		int calculate(int number);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		System.out.println("Please Enter a Number : ");
		int inputNum = in.nextInt();
		
		// Define a Lambda Expression with uses the above Functional Interface
		Square square = number -> number * number;
		
		System.out.println("Square of "+inputNum+" is "+square.calculate(inputNum));
		
		in.close();
	}

}
