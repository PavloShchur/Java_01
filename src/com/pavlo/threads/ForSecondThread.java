package com.pavlo.threads;

public class ForSecondThread {

	public static void main(String[] args) {
			
		new SecondThread();
		
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Main thread " + i);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			System.out.println("terminated thread");
			e.printStackTrace();
		} finally {
			System.out.println("Second thread ended");
		}
	}

}
