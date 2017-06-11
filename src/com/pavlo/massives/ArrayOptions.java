package com.pavlo.massives;

import java.util.Arrays;

public class ArrayOptions {

	public static void main(String[] args) {
		BerylliumSphere[] a;
		BerylliumSphere[] b = new BerylliumSphere[5];

		System.out.println("b: " + Arrays.toString(b));
		BerylliumSphere[] c = new BerylliumSphere[4];
		for (int i = 0; i < c.length; i++)
			if (c[i] == null)
				c[i] = new BerylliumSphere();
		BerylliumSphere[] d = { new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere() };

		a = new BerylliumSphere[] { new BerylliumSphere(), new BerylliumSphere() };
		System.out.println("a: " + a.length);
		System.out.println("b: " + b.length);
		System.out.println("c: " + c.length);
		System.out.println("d: " + d.length);
		a = b;
		System.out.println("a: " + a.length);

		int[] e;
		int[] f = new int[5];
		System.out.println(Arrays.toString(f));
		int[] g = new int[4];
		for (int j = 0; j < g.length; j++)
			g[j] = j*j;

		int[] h = { 11, 47, 93 };
		System.out.println("f.lenght: " + f.length);
		System.out.println("g.lenght: " + g.length);
		System.out.println("h.lenght: " + h.length);
		e = h;
		System.out.println("e.lenght: " + e.length);
		e = new int[] { 1, 2 };
		System.out.println("e.lenght: " + e.length);

	}
}
