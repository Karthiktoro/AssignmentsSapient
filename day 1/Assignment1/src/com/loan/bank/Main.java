package com.loan.bank;

public class Main {

	public static void main(String[] args) {
		PersonalLoan ref = new PersonalLoan(350, 12, "karthik", 10.5);
		HomeLoan h1 = new HomeLoan(560, 15, "John", 6.7);
		
		
		System.out.println(ref.getLoanAmount());
		System.out.println(h1.getPerson());
		
		ref.setNumberOfMonths(8);
		System.out.println(ref.getNumberOfMonths());
		
		System.out.println("interest on personal loan : "+ref.interest(350, 12, 10.5));
	}

}
