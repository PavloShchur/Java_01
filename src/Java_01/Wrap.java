package Java_01;

public class Wrap {

//	public static void main(String[] args) {
//		Integer Ob = new Integer(100);
//		int i = Ob.intValue();
//		System.out.println(i + " " + Ob);
		
//		Integer iOb = 100; // автоупаковка значення типу int
//		int i = iOb; // авторозпаковка
//		System.out.println(i +  " " + iOb);
		
		static int m(Integer v) {
			return v;
		}
	public static void main(String[] args) {
		Integer iOb = m(100);
		System.out.println(iOb);
		
		
	}

}
