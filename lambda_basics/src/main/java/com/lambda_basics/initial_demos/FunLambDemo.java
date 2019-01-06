package com.lambda_basics.initial_demos;

/**
 * @author Aniket Bharsakale
 *
 * 
 */
public class FunLambDemo {

	/**
	 * A functional interface having only 1 abstract method 
	 * but can have any number of default method
	 */
	@FunctionalInterface
	interface FuncInterface {
		void abstractMethod(int x);
		
		default void defaultMtd1() {
			System.out.println("FunInterface 1st def. method");
		}
		
		default int defaultMtd2 (int x, int y) {
			return x+y;
		}
	}
	
	public static void main(String[] args) {
		
		//Lambda Expression that implements the above Interface
		FuncInterface fi = (int p) -> System.out.println("The value of x:"+p);
		
		fi.abstractMethod(1);
		
		fi.defaultMtd1();
		
		System.out.println("result : "+fi.defaultMtd2(2, 4));
	}

}
