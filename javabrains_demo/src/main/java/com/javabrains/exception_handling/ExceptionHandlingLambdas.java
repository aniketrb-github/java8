package com.javabrains.exception_handling;

import java.util.function.BiConsumer;

public class ExceptionHandlingLambdas {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4 };
		int opKey = 0;
		
		process(array, opKey, wrapperExceptionHandlingLambda((v ,k) -> System.out.println(v / k)) );
	}
	
	private static void process(int[] someNumbers, int opKey, BiConsumer<Integer, Integer> biConsumer) {
		for(int number : someNumbers) {
			biConsumer.accept(number, opKey);
		}
	}
	
	private static BiConsumer<Integer, Integer> wrapperExceptionHandlingLambda(BiConsumer<Integer, Integer> consumer){
		return (value, opKey) -> {
			try {
				System.out.println(value / opKey);
			} catch (Exception e) {
				System.err.println("Arithmetic Exception for Divide By Zero for "+value+"/"+opKey);
			}
		}; 
	}

}
