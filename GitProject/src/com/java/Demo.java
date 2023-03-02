package com.java;

import java.util.HashSet;

public class Demo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("Ashu");
		hs.add(10);
		hs.add('s');
		
		hs.forEach(S -> System.out.println(S));

	}

}
