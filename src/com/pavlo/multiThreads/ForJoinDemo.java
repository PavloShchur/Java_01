package com.pavlo.multiThreads;

public class ForJoinDemo {

	public static void main(String[] args) {
		JoinDemo joinDemo_1 = new JoinDemo("one");
		JoinDemo joinDemo_2 = new JoinDemo("two");
		JoinDemo joinDemo_3 = new JoinDemo("three");
		
		System.out.println("start of thread one " + joinDemo_1.t.isAlive());
		System.out.println("start of thread two " + joinDemo_2.t.isAlive());
		System.out.println("start of thread three " + joinDemo_3.t.isAlive());
		
		try {
			joinDemo_1.t.join();
			joinDemo_2.t.join();
			joinDemo_3.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("end of thread one " + joinDemo_1.t.isAlive());
		System.out.println("end of thread two " + joinDemo_2.t.isAlive());
		System.out.println("end of thread three " + joinDemo_3.t.isAlive());
		System.out.println("end of main");
	}

}
