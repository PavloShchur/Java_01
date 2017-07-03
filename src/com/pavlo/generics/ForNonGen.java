package com.pavlo.generics;

public class ForNonGen {
		
		public static void main(String[] args) {
			NonGen iObject = new NonGen(33);
			iObject.showType();
			int Number = (int) iObject.getOb();
			System.out.println(Number);
			
			System.out.println();
			
			NonGen sObject = new NonGen("Hello");
			sObject.showType();
			String Word = (String) sObject.getOb();
			System.out.println(Word);
			
			iObject = sObject;
			Number = (int) iObject.getOb();
			System.out.println(Number);
		}
	
}
