package Java_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReaderLines {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("������ ������ ������.");
		System.out.println("������ '����' ��� ����������.");
		do {
			str = br.readLine();
			System.out.println(str);
		} while (!str.equals("����"));
	}

}
