package com.pavlo.multiThreads;

public class ThirdtClass extends Thread {

	public ThirdtClass() {
		super("New Thread");
		System.out.println("second thread " + this);
		start();
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println();
				Thread.sleep(500);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("second thread ended");
		}
	}
}
