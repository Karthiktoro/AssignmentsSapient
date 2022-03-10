package org.demo.client;
import org.demo.tools.Calculator;

public class MathTester {

	public static void main() {
		Calculator c = new Calculator(22, 10);
		System.out.println("add   "+c.add());
		System.out.println("multiply  "+c.multiply());
		System.out.println("subtract  "+c.subtract());
	}
}
