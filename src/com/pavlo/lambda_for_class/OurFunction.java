package com.pavlo.lambda_for_class;


@FunctionalInterface
public interface OurFunction<T> {

	boolean someMethod(T v1, T v2);
	
}
