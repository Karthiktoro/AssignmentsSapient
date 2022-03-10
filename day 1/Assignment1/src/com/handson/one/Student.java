package com.handson.one;

public class Student {
	
	//public Student(){
		//System.out.println("default constructor");
	//}

	public Student(int a) {
		System.out.println("number "+a);
	}
	
	public Student(double a) {
		System.out.println("decimal number"+a);
	}
	
	public static void main(String[] args) {
		Student ref = new Student(5.0d);
	}
}
/*when deleted default constructor it throws Exception in thread "main" java.lang.Error
 *if arguments passed desired output is obtained 
 * */
