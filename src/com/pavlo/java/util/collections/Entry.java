package com.pavlo.java.util.collections;

public interface Entry<K, V> {
	K getKey();
	V getValue();
	V setValue(V value);
}
