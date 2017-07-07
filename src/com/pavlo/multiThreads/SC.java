package com.pavlo.multiThreads;

import com.pavlo.supply.consumer.Consumer;
import com.pavlo.supply.consumer.Supplier;
import com.pavlo.supply.consumer.SynchroConsumer;

public class SC {

	public static void main(String[] args) {
		SynchroConsumer sinchroQ = new SynchroConsumer();
		Supplier supplier = new Supplier(sinchroQ);
		Consumer consumer = new Consumer(sinchroQ);
		
		try {
			supplier.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			consumer.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

	}

}
