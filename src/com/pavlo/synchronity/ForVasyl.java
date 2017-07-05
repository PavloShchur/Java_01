package com.pavlo.synchronity;

public class ForVasyl {

	public static void main(String[] args) {
		
		Unsynchrosynchro us = new Unsynchrosynchro();
		Vasyl vasyl1 = new Vasyl("Hello", us);
		Vasyl vasyl2 = new Vasyl("I am", us);
		Vasyl vasyl3 = new Vasyl("Vasyl", us);
		
		try {
			vasyl1.t.join();
			vasyl2.t.join();
			vasyl3.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}

}
