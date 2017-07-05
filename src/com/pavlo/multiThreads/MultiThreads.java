package com.pavlo.multiThreads;

public class MultiThreads implements Runnable {
	
	String nameOfThread;
	
	Thread t;

	public MultiThreads(String nameOfThread) {
		super();
		t = new Thread(this, nameOfThread);
		System.out.println("new Thread " + t);
		t.start();
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(nameOfThread + " " + i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println(nameOfThread + " ended");
		}
	}
	
	
	
	

}
