/**
 * 
 */
package com.handson.one;


public class MethodOverloading {

	public void hello(int i) {
		System.out.println("output int "+i); //this method gets executed
	}
	
	public void hello(byte i) {
		System.out.println("output byte "+i);
	}
	
	public void hello(short i) {
		System.out.println("output short"+i);
	}
	
	public void hello(long i) {
		System.out.println("output long "+i);
	}
	
	
	
	
	public static void main(String[] args) {
		
		MethodOverloading ref =new MethodOverloading();
		ref.hello(5);
		//got output int 5 cause data type is int 
		
	}

}
