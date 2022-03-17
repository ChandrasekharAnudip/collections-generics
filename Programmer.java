package com.collections.demo;

public class Programmer {
	private int programmerID;  
	private String name;  
	private int age;
	
	public Programmer(int programmerID,String name,int age){  
		this.programmerID=programmerID;  
		this.name=name;  
		this.age=age;  
	}

	public int getProgrammerID() {
		return programmerID;
	}

	public void setProgrammerID(int programmerID) {
		this.programmerID = programmerID;
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
	public String toString() {
		return "Programmer [programmerID=" + programmerID + ", name=" + name
				+ ", age=" + age + "]";
	}  
	
	
}
