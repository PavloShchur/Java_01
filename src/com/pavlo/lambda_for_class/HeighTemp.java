package com.pavlo.lambda_for_class;

public class HeighTemp {
	
	private int htemt;

	public HeighTemp(int htemt) {
		this.htemt = htemt;
	}
	
	boolean sameTamt(HeighTemp heighTemp){
		return htemt == heighTemp.htemt;
	}
	
	boolean lessThenTemp(HeighTemp heighTemp){
		return htemt < heighTemp.htemt;
	}
	
	

}
