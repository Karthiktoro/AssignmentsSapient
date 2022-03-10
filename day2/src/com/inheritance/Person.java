package com.inheritance;

public class Person {

		int id;
		String name;

		public Person(int id, String name) {
			this.id=id;
			this.name=name;
		}
		
		public String getDetails() {
			return id + " " + name;
		}
}
