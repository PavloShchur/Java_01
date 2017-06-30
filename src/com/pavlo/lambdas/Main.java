package com.pavlo.lambdas;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
			
//		Our_value our_value = () -> 10;
//		System.out.println(our_value.number());
		
		/*Our_value our_value = () -> System.out.println(2);
		our_value.number();*/
		
//		Division division = (n) -> System.out.println((n % 2) == 0);
//		division.div(7);
		
//		Div div = (n) ->(n % 2 == 0);
//		System.out.println(div.div(0));
		
		
//		Div div1 = (int n) -> n >= 0;
//		if(div1.div(4)) System.out.println("+");
//		if(!div1.div(3)) System.out.println("-");
		
//		LambdaForBlock forBlock = (int size, int range) -> {
//			int [] a = new int[size];
//			Random r = new Random();
//			for (int i = 0; i < a.length; i++) {
//				a[i] = r.nextInt(range);	
//			}
//			
//		for (Integer mass : a) {
//			System.out.println(mass + " ");
//		}	
//		return a;	
//		};
//		
//		forBlock.mass(10, 100);
		
		GenricIntLambda<String> reverse = str -> {
			String result = "";
			for (int i = str.length() - 1; i > 0; i--) {
				result += str.charAt(i);
			}
			return result;
		};
		String s = "Word";
		System.out.println(reverse.func(s));
		
		GenricIntLambda<Integer> factorial = n -> {
			int result = 1;
			for (int j = 1; j <= n; j++) {
				result *= j;	
			}
			return result;
		};
		
		int numberFactorial = 5;
		System.out.println(factorial.func(numberFactorial));
		
		
		
		
		
		
		
		
		
		
		
	}

}
