package com.birds;

public class Eagle extends Birds {

	private String sound;
	
	public Eagle(String sound){
		this.sound = sound;
	}
	
	@Override
	public String noise() {
		return "Eagle "+this.sound;
	}
}
