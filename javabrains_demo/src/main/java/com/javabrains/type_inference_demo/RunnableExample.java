package com.javabrains.type_inference_demo;import org.omg.Messaging.SyncScopeHelper;

/**
 * @author Aniket Bharsakale
 * Here, we can see how the LambdaExp has replaced the boiler plate code
 * of creating an Anonymous Inner class instance & then using it
 */
public class RunnableExample {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Hello from Thread Anon inner class.");
			}
		});
		
		// this instance spawns & helps execute the thread.
		thread.start();
		
		// LambdaExp which does the same above thing in 1 line code
		Runnable lambdaRunnableThread = () -> System.out.println("Hello from LambdaExp. using the Runnable Functional Interface.");
		// this only executes the run() of the Runnable & does not spawns & starts a thread 
		lambdaRunnableThread.run();
		
		// another Lambda using the Thread class
		Thread lambdaThread = new Thread(() -> System.out.println("Hello from LambdaExp using the Thread Class."));
		// but this does so creating a thread in thread pool & initiates it.
		lambdaThread.start();
	}
	


}
