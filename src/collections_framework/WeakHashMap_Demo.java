package collections_framework;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMap_Demo {

	@SuppressWarnings("rawtypes")
	private static Map map;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		map = new WeakHashMap();
		map.put(new String("Maine"), "Augusta");
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				while (map.containsKey("Maine")){
					try{
						Thread.sleep(500);
					} catch (InterruptedException ignore) {
					}
					System.out.println("Thread waiting");
					System.gc();
				}
			}
		};
		Thread t = new Thread(runnable);
		t.start();
		System.out.println("Main waiting");
		try {
			t.join();
		} catch (InterruptedException ignore) {
		}
		
	}

}
