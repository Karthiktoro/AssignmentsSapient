package com.exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {

		try {
			int a = 10;
			int b = 0;
			int c = a / b;
			System.out.println("no exception");
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("code executed normally");

	}

}
