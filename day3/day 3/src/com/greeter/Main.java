package com.greeter;

public class Main {

	public static void main(String[] args) {
		Greeter g = new EnglishGreeting();
		g.morningGreeting();
		g.eveningGreeting();
		
		Greeter g1 = new KannadaGreeting();
		g1.morningGreeting();
		g1.eveningGreeting();
	}

}
