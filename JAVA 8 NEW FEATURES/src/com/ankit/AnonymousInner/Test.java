package com.ankit.AnonymousInner;

public class Test {
public static void main(String[] args) {
	// we are writing a class that implements runnable , 
	// and we provided implementation for run() method
	// and for that implementation class we are creating a object
	Runnable r = new Runnable() {// it is not runnable object it object of implementation class
	// but problem is implementation class is not having any name
	// therefore it is consider as anonymous inner class
		@Override
		public void run() {
			for(int i=0;i<10;i++) {
				System.out.println("Child Thread");
			}
			
		}
	};
	Thread t =new Thread(r);
	t.start();
	for(int i=0;i<10;i++) {
		System.out.println("Main Thread");
	}
}
}
