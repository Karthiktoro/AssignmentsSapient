package com.handson.one;

public class TestingMethodOverloading {

	
	public void send(int a) {
		System.out.println(" number "+a+" is sent");
	}
	
	public void send(String a) {
		System.out.println("String "+a+" is sent");
	}
	
	
	public void send(float a) {
		System.out.println("float "+a+" is sent");
	}
	
	public void send(String a , float c) {
		System.out.println("String "+a+" is sent float "+c);
	}
	public static void main(String[] args) {
	TestingMethodOverloading ref = new TestingMethodOverloading();
	ref.send(2.1f);
	ref.send(10);
	ref.send("karthik");
	ref.send("karthik", 4);

	}

}
