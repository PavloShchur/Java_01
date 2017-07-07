package com.pavlo.supply.consumer;

public class Consumer implements Runnable {

	public SynchroConsumer sinchroQ;
	
	public Thread t;

	public Consumer(SynchroConsumer sinchroQ) {
		this.sinchroQ = sinchroQ;
		t = new Thread(this, "consum");
		t.start();
	}

	@Override
	public void run() {
		int i = 0;
		while (i <= 9) {
			i++;
			sinchroQ.get();
		}
	}

}
