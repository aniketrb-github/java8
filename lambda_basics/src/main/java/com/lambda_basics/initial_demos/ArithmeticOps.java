package com.lambda_basics.initial_demos;

import java.util.Scanner;


/**
 * @author Aniket Bharsakale
 * 
 */
public class ArithmeticOps {

	@FunctionalInterface
	interface IAdd {
		
		// can have more than one default methods in F.I
		default void progMotive(int num1, int num2, int result) {
			System.out.println("Addition of 2 Numbers Program.\t"+num1+" + "+num2+" = "+result);
		}
		
		// can have only 1 abstract method
		int add(int operand1, int operand2);
	}
	
	@FunctionalInterface
	interface ISubtract {
		
		default void progMotive(int num1, int num2, int result) {
			System.out.println("Subtraction of 2 Numbers Program.\t"+num1+" - "+num2+" = "+result);
		}
		
		int subtract(int operand1, int operand2);
	}
	
	@FunctionalInterface
	interface IMultiply {
		int multiply(int operand1, int operand2);
		
		default void progMotive(int num1, int num2, int result) {
			System.out.println("Multiplication of 2 Numbers Program.\t"+num1+" x "+num2+" = "+result);
		}
	}
	
	@FunctionalInterface
	interface IDivide {
		int divide(int operand1, int operand2);
		
		default void progMotive(int num1, int num2, int result) {
			if(result != -99)
				System.out.println("Division of 2 Numbers Program.\t"+num1+" / "+num2+" = "+result);
			else 
				System.out.println("Division of 2 Numbers Program. Note: Input as a Denominator cannot be zero. Divide by 0 error !");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Arithmetic Operations using Functional Interfaces & Lambda expressions.");
		
		// To accept input from user. This is an interactive program
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter the 1st Number & press enter:"); 
		int num1 = in.nextInt();
		
		System.out.println("Please enter the 2nd Number & press enter:");
		int num2 = in.nextInt();
		
		int result = 0;
		
		// lambda expression for IDivide Functional Interface
		IDivide divide = (int operand1, int operand2) -> {
			if (operand2 != 0)
				return (operand1 / operand2);
			else
				return -99;
		};
		result = divide.divide(num1, num2);
		divide.progMotive(num1, num2, result);
		result = 0;
		
		// lambda expression for IAdd Functional Interface
		IAdd add =  (int operand1, int operand2) -> (operand1 + operand2);
		result = add.add(num1, num2);
		add.progMotive(num1, num2, result);
		result = 0;
		
		// lambda expression for ISubtract Functional Interface
		ISubtract subtract = (int operand1, int operand2) -> (operand1 - operand2);
		result = subtract.subtract(num1, num2);
		subtract.progMotive(num1, num2, result);
		result = 0;
		
		// lambda expression for IMultiply Functional Interface
		IMultiply multiply = (int operand1, int operand2) -> (operand1 * operand2);
		result = multiply.multiply(num1, num2);
		multiply.progMotive(num1, num2, result);
		result = 0;
		
		in.close();
	}

}
