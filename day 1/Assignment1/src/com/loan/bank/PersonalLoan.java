package com.loan.bank;

public class PersonalLoan {

	private int loanAmount;
	private int numberOfMonths;
	private String person;
	private double percentage;
	
	public PersonalLoan(int loanAmount,int numberOfMonths , String person , double percentage) {
		this.loanAmount = loanAmount;
		this.numberOfMonths =numberOfMonths;
		this.person =person;
		this.percentage =percentage;
	}
	
	public double interest(int loanAmount,int numberOfMonths, double percentage) {
		return (this.loanAmount*this.numberOfMonths*this.percentage)/12;
	}

	public int getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getNumberOfMonths() {
		return numberOfMonths;
	}

	public void setNumberOfMonths(int numberOfMonths) {
		this.numberOfMonths = numberOfMonths;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	
	
}
