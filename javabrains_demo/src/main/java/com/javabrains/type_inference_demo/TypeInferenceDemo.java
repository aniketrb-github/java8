package com.javabrains.type_inference_demo;

/**
 * @author Aniket Bharsakale
 * A Demo on how java compiler does the Type Inference based on
 * the return types, the input argument, the lambda exp. being passed & used 
 */
public class TypeInferenceDemo {

	public static void main(String[] args) {
		// Having only 1 arg in u can avoid the () as well as the data type of that arg
		// same is with the body of lambda, if u only have 1 line of code, u can skip the {}
		// StringLengthLambda myLambda =  (String str) -> str.length();
		// here, input arg/argList : String str | returns int
		StringLengthLambda myLambda =  str -> str.length();
		
		System.out.println("Main: Length of String 'Hello World' is :"+myLambda.getStrLength("Hello World"));
		
		// Type Inference via Lambba Exp.
		printLambda(myLambda);
	}
	
	// Type Inference in action
	public static void printLambda(StringLengthLambda lambda) {
		System.out.println("PrintLambda: Length of 'Hello Java8 World!' is:"+lambda.getStrLength("Hello Java8 World!"));
	}
	
	// Implementation for this F.I is provided above ain Main-
	@FunctionalInterface
	interface StringLengthLambda {
		int getStrLength(String str);
	}
}
