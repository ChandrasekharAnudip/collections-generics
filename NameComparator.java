package com.collections.demo;

import java.util.Comparator;

public class NameComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		Programmer programmer1 = (Programmer)obj1;
		Programmer programmer2 = (Programmer)obj2;
		
		String name1 = programmer1.getName();
		String name2 = programmer2.getName();
		
		return name1.compareTo(name2);
		
		//return programmer1.getName().compareTo(programmer2.getName());
	}

}
