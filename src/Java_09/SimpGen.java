package Java_09;

public class SimpGen {

	public static void main(String[] args) {
		TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Узагальнення");
		tgObj.showTypes();
		
		int v = tgObj.getOb1();
		System.out.println("Значення: " + v);
		
		String string = tgObj.getOb2();
		System.out.println("Значення: " + string);
	}

}
