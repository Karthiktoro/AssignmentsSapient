package com.exceptionHandling;

public class MainDemo1 {

	public static void main(String[] args) {
		MyDemo1 d1 = new MyDemo1();
		MyDemo1 d2 = new MyDemo1();
		MyDemo1 d3 = new MyDemo1();
		d1.start();
		d2.start();
		d3.start();
		try {
			Thread.sleep(1000);
			Thread.sleep(1000);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

		

	}

}
