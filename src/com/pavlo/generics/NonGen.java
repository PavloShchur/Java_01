package com.pavlo.generics;

 class NonGen {
	Object ob;

	public NonGen(Object ob) {
		super();
		this.ob = ob;
	}

	public Object getOb() {
		return ob;
	}

	public void showType() {
System.out.println("���� ob ���������� �� ���� " + ob.getClass().getName());
}
	
	
}
