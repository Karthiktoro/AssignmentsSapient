package com.birds;

public class Duck extends Birds {
	private String sound;
	
	public Duck(String sound){
		this.sound = sound;
	}
	@Override
	public String noise() {
		return "Duck "+this.sound;
	}
}
