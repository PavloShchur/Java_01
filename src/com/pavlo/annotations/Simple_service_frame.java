package com.pavlo.annotations;

@Service_frame(name = "This is Simple")
public class Simple_service_frame {
	@Init_frame
	public void intService() {
		System.out.println("Simple init.");
	}

	public void word() {
		System.out.println("You don't see me.");
	}
}
