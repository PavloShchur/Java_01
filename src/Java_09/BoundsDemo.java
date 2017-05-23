package Java_09;

public class BoundsDemo {

	public static void main(String[] args) {
		Integer inums[] = {1, 2, 3, 4, 5};
		Stats<Integer> iOb = new Stats<Integer>(inums);
		double v = iOb.average();
		System.out.println("Середнє значення iOb рывне: " + v);
		
		Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
		Stats<Double> dOb = new Stats<Double>(dnums);
		double w = dOb.average();
		System.out.println("Середнє значення iOb рывне: " + w);
	}

}
