package org.demo.tools;

public class Calculator {
	// add,multiply,subtract
	public int num1;
	public int num2;

	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int add() {
		return this.num1 + this.num2;
	}

	public int multiply() {
		return this.num1 * this.num2;
	}

	public int subtract() {
		return this.num1 - this.num2;
	}
}
