package com.pavlo.susspnedResumeThreadModern;

public class SunspendResumeModern {

	public static void main(String[] args) {

		NewThread nt1 = new NewThread("one");
		NewThread nt2 = new NewThread("two");

		try {
			Thread.sleep(1000);
			nt1.mySusspend();
			System.out.println("Thread one is suspended");
			Thread.sleep(1000);
			nt1.myResume();
			System.out.println("Thread one resumed");

			Thread.sleep(1000);
			nt2.mySusspend();
			System.out.println("Thread two is suspended");
			Thread.sleep(1000);
			nt2.myResume();
			System.out.println("Thread two resumed");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println("waint for threads ending");
			nt1.t.join();
			nt2.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main thread ended");
	}

}
