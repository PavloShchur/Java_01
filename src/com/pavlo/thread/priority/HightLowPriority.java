package com.pavlo.thread.priority;

public class HightLowPriority {
	
	public static void main(String[] args) {
		
		Thread.currentThread();
		Clicker hiClicker = new Clicker(Thread.NORM_PRIORITY + 2);
		Clicker lowClicker = new Clicker(Thread.NORM_PRIORITY - 2);
		
		hiClicker.start();
		lowClicker.start();
		
		try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		hiClicker.stop();
		lowClicker.stop();
		
		try {
			hiClicker.t.join();
			lowClicker.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Low priority clicker " + lowClicker.click);
		System.out.println("High priority clicker " + hiClicker.click);
	}

}
