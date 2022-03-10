package com.animals;

public class Dog extends Animal {

	private String noise;
	
	public Dog(String name ,String noise){
		super(name);
		this.noise = noise;	
	}
	
	@Override
	public void talk() {
		System.out.println(getname()+"  "+this.noise );
	}
	
}
