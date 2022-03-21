/*
 * 
 *There are three ways to traverse collection elements:
 *
 *	By Iterator interface.
 *  By for loop
 *	By for-each loop.
 * 
 * 
 * The addAll(Collection<? super T>, T..) method is used to add all of the 
 * specified elements to the specified collection.
 * 
 * Declaration
 * Following is the declaration for java.util.Collections.addAll() method.
 * 
 * 
 * public static <T> boolean addAll(Collection<? super T> c, T.. a)
 * 
 * 
 * Parameters
 * 
 * c -- This is the collection into which elements are to be inserted.
 * 
 * a -- This is the elements to insert into c
 * 
 * Return Value
 * 
 * The method call returns 'true' if the collection changed as a result of the call
 * 
 * 
 * Exception
 * 
 * UnsupportedOperationException -- This is thrown if c does not support the 
 * add method.
 * 
 * NullPointerException -- This is thrown if elements contains one or more 
 * null values and c does not support null elements.
 * 
 * IllegalArgumentException -- This is thrown if some aspect of a value in 
 * elements prevents it from being added to c.
 * 
 * 
 * 
 *  
 *   
 */
package com.collections.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection002 {
	public static void main(String[] args) {
		
		//1. ArrayList with iterator
		
		/*
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		
		list.add("Ravi");//Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		
		
		for(String name:list) {
			System.out.println(name);
		}
		
		System.out.println("************************");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("************************");
		
		//Traversing list through Iterator
		
		Iterator<String> itr=list.iterator();  
		  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}
		*/
	
		
		
		//2. ArrayList with for-each loop
		
		
		//ArrayList<String> list=new ArrayList<String>();
		/*
		List<String> list=new ArrayList<String>();
		
		list.add("Ravi");  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		
		for(String name:list) {
			System.out.println(name);
		}
		
		*/
		
		//3. User-defined class objects in Java ArrayList
		
		//Creating user-defined class objects  
		
		/*
		Student s1=new Student(101,"Prahaash",23);  
		Student s2=new Student(102,"Chaithanya",21);  
		Student s3=new Student(103,"Priya",25);
		
		
		
		ArrayList<Student> students = new ArrayList<>();
		*/
		
		/*
		ArrayList<Student> students = new ArrayList<>();
		
		students.add(new Student(101,"Prahaash",23));
		students.add(new Student(102,"Chaithanya",21));
		students.add(new Student(103,"Priya",25));
		*/
		
		/*
		students.add(s1);
		students.add(s2);
		students.add(s3);
		*/
		
		// for-each loop
		/*
		for(Student student:students) {
			System.out.println(student);
		}
		
		
		System.out.println("+++++++++++++++++++++++++++");
		
		for(int i=0; i<students.size(); i++) {
			System.out.println(students.get(i));
		}
		
		System.out.println("+++++++++++++++++++++++++++");
		
		
		// iterator
		
		Iterator itr = students.iterator();
		
		System.out.println("+++++++++++++++++++++++++++++++++");
		
		while(itr.hasNext()) {
			Student student = (Student)itr.next();
			
			if(student.getRollno() == 103) {
				student.setAge(36);
			}
			
			System.out.println(student);
			
			//System.out.println(itr.next());//student);
		}
		
		
		// iterator<Student> generic
		
		Iterator<Student> stuItr = students.iterator();
		System.out.println("+++++++++++++++++++++++++++++++++");
		while(stuItr.hasNext()) {
			System.out.println(stuItr.next());
		}
		*/
		
		//4. addAll(Collection c) method
		/*
		ArrayList<String> al=new ArrayList<String>();  
		
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ajay");  
		
		ArrayList<String> al2=new ArrayList<String>();  
		
		al2.add("Sonoo");  
		al2.add("Hanumat");  
		
		
		//for(String name : al2){
		//	al.add(name);
		//}
		
		al.addAll(al2);//adding second list to first list
		
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		   System.out.println(itr.next());  
		 }  
		
		
		System.out.println("++++++++++++++++++++++++++");
		
		Student s1=new Student(101,"Prahaash",23);  
		Student s2=new Student(102,"Chaithanya",21);  
		Student s3=new Student(103,"Priya",25);
		
		ArrayList<Student> students1 = new ArrayList<>();
		
		students1.add(s1);
		students1.add(s2);
		students1.add(s3);
		
		
		Student s4=new Student(104,"Rajesh",23);  
		Student s5=new Student(105,"Anish",21);  
		Student s6=new Student(106,"Raju",25);
		
		ArrayList<Student> students2 = new ArrayList<>();
		
		students2.add(s4);
		students2.add(s5);
		students2.add(s6);
		
		students1.addAll(students2);
		
		Iterator<Student> stuItr = students1.iterator();
		System.out.println("+++++++++++++++++++++++++++++++++");
		while(stuItr.hasNext()) {
			System.out.println(stuItr.next());
		}
		
		*/
		//5. removeAll() method
		/*
		  ArrayList<String> al=new ArrayList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ajay"); 
		  
		  ArrayList<String> al2=new ArrayList<String>();  
		  al2.add("Ravi");  
		  al2.add("Hanumat");  
		  
		  al.removeAll(al2);  // it will hold now Vijay and Ajay
		  
		  System.out.println("Iterating the elements after removing the elements of al2...");  
		 
		  Iterator<String> itr=al.iterator(); 
		  
		  while(itr.hasNext()){  
			  System.out.println(itr.next());  
		  }
		  
		*/
		
		//6. retainAll() method
		/*
		  ArrayList<String> al=new ArrayList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ajay"); 
		  
		  ArrayList<String> al2=new ArrayList<String>();  
		  al2.add("Ravi");  
		  al2.add("Hanumat");  
		  al2.add("Ajay");
		  
		  al.retainAll(al2); // it will take only the elements which are common  
		  
		  System.out.println("Iterating the elements after retaining the elements of al2...");  
		  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
			  System.out.println(itr.next());  
		  }*/
		 
	}
}
