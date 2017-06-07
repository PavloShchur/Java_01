package com.pavlo.innerClasses;

public class Main {

	public static void main(String[] args) {

		Cat gnom = new Cat();
		gnom.klikuha = "shredinger";
		gnom.age = 30;
		System.out.println(gnom);
		System.out.println();
		
		Cat cat = new Cat("gavchuk", 5);
		System.out.println(cat);
		
		Cat murzik = new Cat("murzik", 12);
		System.out.println(murzik);
		
		Cat newMurzik = new Cat("murzik", 12);
		System.out.println(newMurzik);
		System.out.println();
		
		System.out.println(murzik==newMurzik);
		System.out.println(murzik.equals(newMurzik));
	}

}
