package com.greeter;

public class EnglishGreeting implements Greeter {

	@Override
	public void morningGreeting() {

		System.out.println("good morning");
	}

	@Override
	public void eveningGreeting() {
		System.out.println("good evening");

	}
}
