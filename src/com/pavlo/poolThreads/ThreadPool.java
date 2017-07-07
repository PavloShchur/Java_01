package com.pavlo.poolThreads;

public class ThreadPool implements Runnable{
		
	private String message;

	public ThreadPool(String message) {
		super();
		this.message = message;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "(Start) message " + message);
		processMessage();
		System.out.println(Thread.currentThread().getName() + " end");
	}
	
	private void processMessage() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
