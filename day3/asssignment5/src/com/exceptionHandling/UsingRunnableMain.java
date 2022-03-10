package com.exceptionHandling;

public class UsingRunnableMain {

	public static void main(String[] args) {
		Runnable u = new  UsingRunable();
		Thread t = new Thread(u);
		t.start();
		try {
			t.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

	}

}
