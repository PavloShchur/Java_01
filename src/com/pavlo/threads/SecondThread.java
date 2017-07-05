package com.pavlo.threads;

public class SecondThread implements Runnable {
	
	Thread t;
	
	

	public SecondThread() {
		t = new Thread(this, "new Thread");
		System.out.println("second thread" + t);
		t.start();
	}



	@Override
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
				t.sleep(500);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("terminated");
		}
	}

}
