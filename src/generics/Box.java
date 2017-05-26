package generics;

public class Box<T> {
	
	private T t;
	
	

	public T getT() {
		return t;
	}



	public void setT(T t) {
		this.t = t;
	}



	public static void main(String[] args) {
		Box<Integer> integerBox = new Box<Integer>();
		Box<String> stringBox = new Box<String>();
		
		integerBox.setT(new Integer(10));
		stringBox.setT(new String("Hello"));
		
		System.out.println(integerBox.getT());
		System.out.println(stringBox.getT());
		
		
	}

}
