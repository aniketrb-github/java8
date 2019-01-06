package com.lambda_basics.initial_demos;

/**
 * @author Aniket Bharsakale
 *
 * 
 */
public class FunctionalInterfaceBasics {

	public static void main(String[] args) {

		// anonymous inner class object
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("New Thread Created in anon. inner class !");
			}
		}).start();
		
		
		// lambda expression to create a thread object 
	    new Thread( () -> 
	       {System.out.println("LambdaExpression - thread created");}).start(); 

	}

}
