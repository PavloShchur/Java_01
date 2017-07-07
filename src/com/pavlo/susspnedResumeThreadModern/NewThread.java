package com.pavlo.susspnedResumeThreadModern;

public class NewThread implements Runnable {

	String name;
	Thread t;
	boolean suspandFlag;

	public NewThread(String name) {
		this.name = name;
		t = new Thread(this, name);
		System.out.println("New Thread  " + t);
		suspandFlag = false;
		t.start();
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i <= 10; i++) {
				System.out.println(name + " " + i);
				Thread.sleep(500);
				synchronized (this) {
					while (suspandFlag) {
						wait();
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(name + " ended");
	}

	synchronized void mySusspend() {
		suspandFlag = true;
	}

	synchronized void myResume() {
		suspandFlag = false;
		notify();
	}

}
