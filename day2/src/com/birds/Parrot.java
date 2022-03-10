package com.birds;

public class Parrot extends Birds {
	
	private String sound;
	
	public Parrot(String sound){
		this.sound = sound;
	}
	
	@Override
	public String noise() {
		return "Parrot "+this.sound;
	}
}
