package com.pavlo.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.LinkedList;

public class Main {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws Exception {
		//// Person person = new Person();
		//// Class aClass = person.getClass();
		// // System.out.println(aClass);
		//// Class class1 = Person.class;
		//// System.out.println(class1);
		//// Class class1 = Class.forName("com.pavlo.reflection.Person");
		//// String s = class1.getName();
		//// System.out.println(s);
		//
		// ////////////////////////
		//// Object o = class1.newInstance();
		//// Person person2 = (Person) o;
		//// System.out.println(person2);
		// ////////////////////////
		//
		//// System.out.println(aClass.getModifiers());
		//// System.out.println(Modifier.isPublic(aClass.getModifiers()));
		//
		//
		//// Class superClass = aClass.getSuperclass();
		//// System.out.println(superClass);
		////
		//// Class interInfo = LinkedList.class;
		//// Class[] classes = interInfo.getInterfaces();
		//// for (Class class1 : classes) {
		//// System.out.println(class1);
		//// }
		//
		//// Class pClaqss = Person.class;
		//// Class[] classes1 = pClaqss.getInterfaces();
		//// for (Class class1 : classes1) {
		//// System.out.println(class1);
		//// }
		//
		// ///FIELDS
		//
		//// Person person = new Person();
		//// Class aClass = person.getClass();
		//// Field[] fields = aClass.getDeclaredFields();
		//// for (Field field : fields) {
		//// System.out.println(field);
		//// System.out.println(field.get(person));
		//// //java.lang.IllegalAccessException
		//// field.setAccessible(true);
		//// System.out.println(field.get(person));
		//// System.out.println(field.getModifiers());
		//// System.out.println(Modifier.isPrivate(field.getModifiers()));
		// }

		// Field field = aClass.getDeclaredField("sname");
		// field.setAccessible(true);
		//
		// field.set(person, "Hello");
		// System.out.println(person);
		//
		// String ss = (String) field.get(person);
		// System.out.println(ss);
		//

		// Constructor

		// Person person = new Person();
		// Class aClass = person.getClass();
		// Constructor[] constructors = aClass.getConstructors();
		// for (Constructor constructor : constructors) {
		// // System.out.println(constructor);
		// System.out.println(constructor.getDeclaringClass());
		// System.out.println(constructor.getModifiers());
		// System.out.println(Modifier.isPublic(constructor.getModifiers()));
		//
		// }
		//
		// System.out.println();
		// for (Constructor constructor : constructors) {
		// Class[] classes = constructor.getParameterTypes();
		// for (Class class1 : classes) {
		//// System.out.println(class1);
		// System.out.print(class1.getName() + " | ");
		// }
		// }
		//
		//
		// System.out.println();
		// Class[] classes = new Class[]{int.class, String.class, String.class};
		// Constructor constructor = aClass.getDeclaredConstructor(classes);
		// System.out.println(constructor);

		/* Methods */

//		Person person = new Person();
//		Class aClass = person.getClass();
		// Method[] methods = aClass.getDeclaredMethods();
		// for (Method method : methods) {
		// // System.out.println(method);
		// // System.out.println(method.getReturnType());
		// Class[] classes = method.getParameterTypes();
		// for (Class class1 : classes) {
		// System.out.print(class1.getName() + " ");
		// }
		// System.out.println();
		// }

		// Class[] paramType = new Class[]{String.class, int.class};
		// Method m = aClass.getMethod("word", paramType);
		// System.out.println(m);

//		Class[] paramType = new Class[] { String.class, int.class };
//		Method m = aClass.getDeclaredMethod("word", paramType);
//		Object[] objects = new Object[] { new String("some new Word"), new Integer(9) };
//		Object[] objects_new = new Object[] { new String("some very new Word"), new Integer(90) };
//		m.invoke(person, objects_new);

//		System.out.println(m);
		
		// change private final field
		
		 Person person2 = new Person("Tom");
		 System.out.println(person2);
		    Field f = person2.getClass().getDeclaredField("surname");
		    f.setAccessible(true);
		    System.out.println("f.get(person2): " + f.get(person2));
		    f.set(person2, "Changed!!!");
		    System.out.println(person2);
		    System.out.println("f.get(person2): " + f.get(person2));
		
		

	}

	
}











