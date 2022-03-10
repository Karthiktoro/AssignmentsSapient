package com.exceptionHandling;

public class UsingRunable implements Runnable {

	@Override
	public void run() {
		for(int i = 0 ;i<10;i++) {
			System.out.println("hiii i am getting displayed!!!!" + i);
		}
	}

}
