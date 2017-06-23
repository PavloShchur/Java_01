package com.pavlo.annotations;

import java.lang.reflect.Method;

public class Annotayion_knowledge {

	public static void main(String[] args) {
		inspectService(Simple_service_frame.class);
		inspectService(Lazy_service_frame.class);
		inspectService(String.class);

	}
	
	static void inspectService(Class service) {
		if (service.isAnnotationPresent(Service_frame.class)) {
			Service_frame annotation = (Service_frame) service.getAnnotation(Service_frame.class);
			// System.out.println(annotation);
			// System.out.println(annotation.name());
			// System.out.println(annotation.lazyLoad());
			
			Method[] methods = service.getDeclaredMethods();
			for (Method method : methods) {
				if (method.getAnnotation(Init_frame.class) != null) {
					System.out.println(method);
				} else {
					System.out.println("This doesn't have init annotation");
					System.out.println();
				}
			}
		} else {
			System.out.println();
			System.out.println("Class without annotation.");
		}
	}

}
