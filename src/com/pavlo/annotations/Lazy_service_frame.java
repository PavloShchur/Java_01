package com.pavlo.annotations;

@Service_frame(name = "lazyThots")
public class Lazy_service_frame {
	
		@Init_frame
		public void lazyInit() throws Exception{
			System.out.println("Lazy Init");
		}
}
