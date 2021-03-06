package com.threads;

import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Resource r = new Resource();
		Thread t1 = new Thread(new MyThread(r, "Hello"));
		Thread t2 = new Thread(new MyThread(r, "Good"));
		Thread t3 = new Thread(new MyThread(r, "World"));
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();


	}
}
