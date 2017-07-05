package com.pavlo.multiThreads;

public class JoinDemo implements Runnable {

	String name;
	Thread t;
	public JoinDemo(String name) {
		this.name = name;
		t = new Thread(this, name);
		System.out.println("new thread " + t);
		t.start();
	}
	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(this.name + " " + i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println(name + " ended");
		}
		
	}
	
	
}
