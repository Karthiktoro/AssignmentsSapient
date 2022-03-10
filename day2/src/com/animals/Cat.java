package com.animals;

public class Cat extends Animal{

private String noise;
	
	public Cat(String name ,String noise){
		super(name);
		this.noise = noise;	
	}
	
	@Override
	public void talk() {
		System.out.println(getname()+" "+this.noise);
	}
}
