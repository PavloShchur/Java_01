package com.pavlo.lambda_for_class;

public class OurStringOP {

	public OurStringOP() {
	}

//	static String strReverse(String s) {
	String strReverse(String s) {
		String result = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			result += s.charAt(i);
		}

		return result;
	}

//	static String StringFumction(String_function sf, String s) {
//		return sf.func(s);
//	}

}
