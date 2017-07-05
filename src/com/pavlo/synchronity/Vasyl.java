package com.pavlo.synchronity;

public class Vasyl implements Runnable {

	String s;
	Unsynchrosynchro us;
	Thread t;

	public Vasyl(String s, Unsynchrosynchro us) {
		this.s = s;
		this.us = us;
		t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		synchronized (us) {
			us.call(s);
		}
	}

}
