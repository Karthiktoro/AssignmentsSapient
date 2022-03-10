package com.inheritance;

public class Main {

	public static void main(String[] args) {
		Person john = new Person(100,"John");

		String details = john.getDetails();
		System.out.println(details);
		
		Employee e  = new Employee(101, "pinto", 45000);
		System.out.println(e.getDetails());
		
		TraineeEmployee t = new TraineeEmployee(1001, "karthik", 40000, "good");
		System.out.println(t.getDetails());

	}

}
