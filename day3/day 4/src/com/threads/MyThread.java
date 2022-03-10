package com.threads;

public class MyThread implements Runnable {

	private Resource res;
	private String message;

	public MyThread(Resource res, String message) {
		this.message = message;
		this.res = res;
	}

	@Override
	public void run() {
		// res.printMessage(message);
		synchronized (res) {
			res.printMessage(message);

		}
	}
}
