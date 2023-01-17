package com.ankit.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(10);
		al.add(25);
		al.add(5);
		al.add(30);
		al.add(0);
		al.add(15);
		
		System.out.println(al);
		Collections.sort(al, new Mycomparator());
		System.out.println(al);
	}
}