package com.inheritance;

public class TraineeEmployee extends Employee{

	String performance;
	
	public TraineeEmployee(int id, String name,double salary, String performance){
	super(id, name, salary);
	this.performance= performance;
	}

	@Override
	public String getDetails() {
		return super.getDetails()+"  "+this.performance;
	}
}
