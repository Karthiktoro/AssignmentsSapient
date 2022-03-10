package com.animals;

public class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}

	public String getname() {
		return this.name;
	}
	public void talk(){
		System.out.println("make noise");//override this method;
	}
	
	
}

		
		

