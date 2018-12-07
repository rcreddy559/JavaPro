package com.org.generic;

public class TwoGen<T,V> {
	T tObj;
	V vObj;
	
	public TwoGen(T t, V v) {
		this.tObj = t;
		this.vObj = v;
	}
	
	void showTypes() {
		System.out.printf("T Object:%s; V Object:%s", tObj.getClass().getName(), vObj.getClass().getName());
	}

}
