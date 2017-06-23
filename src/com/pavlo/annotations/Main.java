package com.pavlo.annotations;

import java.lang.reflect.Field;

public class Main {

	public static void main(String[] args) {
		@My_annotation
		Test test = new Test();
		Class aClass = test.getClass();
		Field[] fields = aClass.getDeclaredFields();
		for (Field field : fields) {
			if (field.isAnnotationPresent(My_annotation.class)) {
				My_annotation annotation = field.getAnnotation(My_annotation.class);
				System.out.println(annotation.qwe());
			}
		}

	}

}
