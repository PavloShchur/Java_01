package com.pavlo.deadlock;

import com.pavlo.threads.ThirdtClass;

public class DeadLockExample {
			
	private String name;

	public DeadLockExample(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

		public synchronized void bow(DeadLockExample bower){
			System.out.format("%s: %s", "has bowed to me %n", this.name, bower.getName());
			bower.bowBack(this);
		}
		
		public synchronized void bowBack(DeadLockExample bower){
			System.out.format("%s: %s", "has bowed back to me %n", this.name, bower.getName());
		}
		
		public static void main(String[] args) {
			DeadLockExample vova = new DeadLockExample("Vova");
			DeadLockExample peter = new DeadLockExample("Peter");
			
			new Thread(()->vova.bow(peter)).start();
			new Thread(()-> peter.bow(vova)).start();
			
		}
}
