package com.pavlo.threads;

public class FirstMainThread {

	public static void main(String[] args) {
		Thread t = Thread.currentThread(); // Thread[main,5,main]

		t.setName("MyThread"); // Thread[MyThread,5,main]

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
