package com.collections.demo;

import java.util.Comparator;

public class AgeComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		Programmer programmer1 = (Programmer)obj1;
		Programmer programmer2 = (Programmer)obj2;
		
		if(programmer1.getAge() == programmer2.getAge()) {
			return 0;
		}
		else if(programmer1.getAge() > programmer2.getAge()) {
			return 1;
		}
		else 
			return -1;
	}

}
