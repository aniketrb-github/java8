package com.lambda_basics.initial_demos;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author Aniket Bharsakale
 * Here we have worked with few built-in functional interfaces of java.util.function package
 * Predicate, Binary Operator, Function
 *
 */
public class PredicateInterfaceDemo {

	public static void main(String[] args) {
		List<String> empNames = Arrays.asList("Ram", "Sam", "Ravi", "Rajesh", "Sahil");
		
		// Lambda Expression to print the List elements
		System.out.println("- Employee names in list are as follows:");
		empNames.forEach(empName -> System.out.print(empName+" "));
		
		// Method1: Lambda Expression to print elements with starting letter as 'R'
		System.out.println("\n- Employees with 'R' starting letter are as follows: ");
		empNames.forEach(empName -> {
			if (empName.startsWith("R"))
				System.out.print(empName+" ");
		});
		
		// Method2: using Predicate built-in functional interface
		System.out.println("\n- Using Built-in Predicate Interface to print Employee names starting with 'S' ");
		
		// Implementation for Predicate FunInterfaces's test method 
		Predicate<String> predicate = (empName) -> empName.startsWith("S");
		
		for(String empName: empNames) {
			if(predicate.test(empName)) 
				System.out.print(empName+" ");
		}
		
		// Binary Operator FunIterface
		BinaryOperator<String> binaryOperator = (name1, name2) -> (name1+" and "+name2) ;
		System.out.println("\n- Binary Operator usage\n"+binaryOperator.apply(empNames.get(0), empNames.get(2)) + " are best friends !");
		
		
		Function<Integer, Integer> function = num1 -> (num1  * 2);
		System.out.println("2 x 2 = "+function.apply(2));
		
		BinaryOperator<Integer> biOperator = (n1, n2) -> (n1 + n2);
		System.out.println("4+4 -> result * 2 ->"+biOperator.andThen(function).apply(4, 4));		
	}

}
