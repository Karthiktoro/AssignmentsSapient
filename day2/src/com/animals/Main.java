package com.animals;

public class Main {

	public static void main(String[] args) {
		Animal a = new Animal("Animal");
		a.talk();
		
		Cat c = new Cat("kitty", "meow");
		c.talk();
		
		Dog d = new Dog("danny", "bow bow");
		d.talk();

	}

}
