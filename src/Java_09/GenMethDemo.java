package Java_09;

public class GenMethDemo {
	static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
		for (int i = 0; i < y.length; i++)
			if (x.equals(y[i]))
				return true;

		return false;
	}
	public static void main(String[] args) {
		Integer nems[] = {1, 2, 3, 4, 5};
		if(isIn(2, nems))
			System.out.println("����� 2 �������� � ����� nems");
		if(!isIn(7, nems))
			System.out.println("����� 7 ������ � ����� nems");
		
		System.out.println();
		String strs[] = {"����", "���", "���", "������", "����"};
		
		if(isIn("���", strs))
			System.out.println("��� �������� � ����� strs");
		

		if(!isIn("��", strs))
			System.out.println("��� �� �������� � ����� strs");
	}
}
