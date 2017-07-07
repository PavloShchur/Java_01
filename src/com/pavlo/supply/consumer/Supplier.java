package com.pavlo.supply.consumer;

public class Supplier implements Runnable {

	public SynchroConsumer sinchro;
	
	public Thread t;

	public Supplier(SynchroConsumer sinchro) {
		this.sinchro = sinchro;
		t = new Thread(this, "supplier");
		t.start();
	}

	@Override
	public void run() {
		int i = 0;
		while (i <= 9) {
			sinchro.put(i++);
		}

	}

}
