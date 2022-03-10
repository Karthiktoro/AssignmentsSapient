package com.exceptionHandling;

public class PriorityMain {

	public static void main(String[] args) {
		Runnable r = new PriorityClass("Dog");
		Thread t = new Thread(r);
		t.start();
		Runnable r1 = new PriorityClass("Cat");
		Thread t1 = new Thread(r1);
		t1.start();
		Runnable r2 = new PriorityClass("lion");
		Thread t2 = new Thread(r2);
		t2.start();

	}

}
