package com.ankit.collection.functional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(23);
		al.add(12);
		al.add(45);
		al.add(10);
		al.add(29);

		System.out.println(al);
// no need to write myComparator class
		Comparator<Integer>c=(i1,i2)-> (i1<i2)?-1:(i1>i2)?1:0;
		Collections.sort(al,c);
		System.out.println(al);
		
		al.stream().forEach(System.out::println);
	
		List<Integer>l2 =al.stream().filter(i->i%2==0).collect(Collectors.toList());
	// it will going to read each and every element present inside the al, if it is a even number ,
	// collect that even number to list , and then return that list
	// now this list contains only even number from this al.
		System.out.println(l2);
	}
}
