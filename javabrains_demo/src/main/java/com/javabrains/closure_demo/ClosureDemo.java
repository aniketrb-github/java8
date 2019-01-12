package com.javabrains.closure_demo;

/**
 * 
 * @author Aniket Bharsakale
 * Closure in Java8
 *
 */
public class ClosureDemo {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 23; // this variable becomes 'effectively final while lambda execution'
		
		// this line execution occurs inside the methodBody of doProcess()
		doProcess(num1, p -> System.out.println(num1+" + "+num2+" = "+(num1+num2)));
	}
	
	// but here only num1 is specified, & num2 is not mentioned. 
	// so when the doProcess() mtd call occurs, the num2 value is freeze by the compiler 
	// i.e nthin but making it effectively final i.e u dont have to explicitly mention final keyword
	public static void doProcess(int num1, Process p) {
		
		// this does not has num2 in its scope
		// the compiler keeps a track of the value of num2
		// here the sysout lambda body is executed 
		p.process(num1);
	}
	
	
	interface Process {
		void process(int num);
	}

}
