package com.pavlo.thread.priority;

public class Clicker implements Runnable {
	
	long click = 0;
	Thread t;
	private volatile boolean running = true;
	
	public Clicker(int prioroty) {
		t= new Thread(this);
		t.setPriority(prioroty);
	}

	

	@Override
	public void run() {
		while(running){
			click++;
		}
	}
	
	public void stop(){
		running = false;
	}
	
	public void start(){
		t.start();
	}	
}

