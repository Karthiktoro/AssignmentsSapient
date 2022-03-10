package com.name;

public class FullName {

	FirstName b = new FirstName();
	LastName c = new LastName();

	public String getFullName() {

		return b.getFirstName() + "  " + c.getLastName();
	}
}
