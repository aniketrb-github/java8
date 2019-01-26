package com.javabrains.method_references;

public class MtdRefDemo1 {

	public static void main(String[] args) {
		//display();
		
		Thread thread = new Thread(() -> display());
		thread.start();
		
		Thread mtdRefThread = new Thread(MtdRefDemo1 :: display);
		mtdRefThread.start();
	}
	
	public static void display() {
		System.out.println("Hello this is a Method Reference Example.");
	}

}
