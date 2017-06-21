package com.pavlo.java.util.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	Person person = new Person(1, "Peter", 23);
	System.out.println(person);
	FileOutputStream fos = new FileOutputStream("person.txt");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(person);
	oos.flush();
	oos.close();
	fos.close();
	System.out.println("+");
	
	ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"));
	Person person2 = (Person) ois.readObject();
	System.out.println(person2);
	ois.close();
	
}
}
