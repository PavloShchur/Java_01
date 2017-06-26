package com.pavlo.annot_for_user;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface InfoAnnotation {

	String dev();

	String date();

	int currentState() default 1;
	
	String lastModif() default "last";
	
	String [] other();

}
