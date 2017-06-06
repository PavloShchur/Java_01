package com.pavlo.interfaces;

public class Adventure {
	public static void t(CanFight x){x.fight();}
	public static void u(CanFly x){x.fly();}
	public static void v(CanSwim x){x.swim();}
	public static void w(ActionCharacter x){x.fight();}
	public static void main(String[] args) {
		Hero h = new Hero();
		t(h);
		u(h);
		v(h);
		w(h);
		
	}

	}

