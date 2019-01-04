package com.lambda_basics.anonInnerClassAndLambdaExpression;

public class MainApp {

	public void greet (IGreeter greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		// Traditional Way of creating an instance of the impl. class
		IGreeter greeter = new GreeterImpl(); 
		greeter.perform();
		
		// Lambda Expression implementing the IGreeter Functional Interface
		IGreeter lambdaGreeter = () -> System.out.println("Hello World from Lambda Expression!");
		
		// Anonymous Inner Class providing implementation for its lone method
		IGreeter anonGreeter = new IGreeter() {
			
			@Override
			public void perform() {
				System.out.println("Hello World from Anonymous Inner Class");
			}
		};
		
		lambdaGreeter.perform();
		
		anonGreeter.perform();
	}

}
