package com.exceptionHandling;

public class PriorityClass implements Runnable {
	private String name ;
	
	public PriorityClass(String name) {
		this.name = name ;
	}
	
	synchronized public  void display() {
		System.out.println("["+name);
		System.out.print("]");
	}
	
	
	@Override
	public void run() {
		display();
	}

}
