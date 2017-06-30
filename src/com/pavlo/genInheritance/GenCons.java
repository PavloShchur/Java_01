package com.pavlo.genInheritance;

public class GenCons {
	
	private double bal;

	public <T extends Number>GenCons(double bal) {
		super();
		this.bal = bal;
	}

	@Override
	public String toString() {
		return "GenCons [bal=" + bal + "]";
	}
	
	
	
	

}
