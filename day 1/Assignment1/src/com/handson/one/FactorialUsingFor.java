package com.handson.one;

public class FactorialUsingFor {

	public static void main(String[] args) {
		int n = 5;
		int fact = 1;
		for(int i =n;i>0;i--) {
			fact = fact *i;
		}
		System.out.println("factorial of "+n+" is "+fact);

	}

}
