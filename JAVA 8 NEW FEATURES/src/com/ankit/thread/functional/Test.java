package com.ankit.thread.functional;

public class Test {
public static void main(String[] args) {
	// Runnable is a functional interface BEACUSE IT CONTAINS ONLY 1 abstract method
	// happily we can go for lambda expression
	// no need to write implementation class

		Runnable  r = ()->{
			for(int i=0;i<10;i++) {
				System.out.println("Child thread");
			}			
		};
		Thread t = new Thread(r);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main Thread");
		}
}
}
