package com.ankit.collect;

import java.util.Comparator;

public class EMployeeName implements Comparator<Employee>{

	@Override
	public int compare(Object o1, Object o2) {
		Employee s1  =(Employee)o1;
		Employee s2  =(Employee)o2;
		
		if(s1<s2) {
			return -1;
		}else if(s1>s2) {
			return +1;
		}else{
			return 0;
		}
	}
}

