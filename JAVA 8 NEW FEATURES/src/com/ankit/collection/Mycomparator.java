package com.ankit.collection;

import java.util.Comparator;

public class Mycomparator implements Comparator<Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {
	// ternary operator
		return (i1<i2)?-1:(i1>i2)?1:0;
		
	}
//		if(i1<i2) {
//			return -1;
//		}else if(i1>i2) {
//			return +1;
//		}else{
//			return 0;
//		}
}
