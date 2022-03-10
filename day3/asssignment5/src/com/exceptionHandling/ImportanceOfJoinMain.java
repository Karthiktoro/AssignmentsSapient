package com.exceptionHandling;

public class ImportanceOfJoinMain {

	public static void main(String[] args) {
		Runnable r = new ImportanceOfJoin();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
		try {
			t1.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			t1.join(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
