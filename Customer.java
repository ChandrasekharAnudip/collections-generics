/*
 * 
 * Java Comparable interface
 * 
 * 1. Java Comparable interface is used to order the objects of user-defined 
 * class.
 * 
 * 2. This interface is found in java.lang package and contains only one 
 * method named compareTo(Object). 
 * 
 * 3. It provide single sorting sequence only i.e. you can sort the elements 
 * on based on single data member only. 
 * 
 * 4. For example it may be no, name, age or anything else.
 * 
 * compareTo(Object obj) method
 * 
 * public int compareTo(Object obj): is used to compare the current object 
 * with the specified object.
 * 
 * We can sort the elements of:
 * 
 * 1. String objects
 * 2. Wrapper class objects
 * 3. User-defined class objects
 * 
 */
package com.collections.demo;

public class Customer  implements Comparable<Customer> {
	private int no;  
	private String name;  
	private int age;
	
	public Customer(int no,String name,int age){  
		this.no=no;  
		this.name=name;  
		this.age=age;  
	} 
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int compareTo(Customer cust){  
		if(age==cust.age)  
			return 0;  
		else if(age>cust.age)  
			return 1;  
		else  
			return -1;  
	} 
}
