package com.birds;

public class Main {

	public static void main(String[] args) {
		Birds b = new Parrot("chirping");
		Eagle e = new Eagle("scream");
		Duck d = new Duck("quak quak");
		
		System.out.println(b.noise());
		System.out.println(e.noise());
		System.out.println(d.noise());
	}

}
