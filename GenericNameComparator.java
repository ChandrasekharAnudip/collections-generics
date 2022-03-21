package com.collections.demo;

import java.util.Comparator;

public class GenericNameComparator implements Comparator<Programmer> {

	@Override
	public int compare(Programmer programmer1, Programmer programmer2) {
		//Programmer programmer1 = (Programmer)obj1;
		//Programmer programmer2 = (Programmer)obj2;
		
		return programmer1.getName().compareTo(programmer2.getName());
	}

}
