/*
 * 
 * Java LinkedList class uses doubly linked list to store the elements. 
 * 
 * It provides a linked-list data structure. 
 * 
 * It inherits the AbstractList class and implements List and Deque 
 * interfaces.
 * 
 * The important points about Java LinkedList are:
 * 
 * 	1. Java LinkedList class can contain duplicate elements.
 *  2. Java LinkedList class maintains insertion order.
 *  3. Java LinkedList class is non synchronized.
 *  4. In Java LinkedList class, manipulation is fast because no shifting 
 *  needs to be occurred.
 *  5. Java LinkedList class can be used as list, stack or queue.
 *  
 *  
 *  Hierarchy of LinkedList class
 *  
 *  Java LinkedList class extends AbstractSequentialList class and 
 *  implements List and Deque interfaces.
 *  
 *  Doubly Linked List
 *  
 *  In case of doubly linked list, we can add or remove elements from 
 *  both sides.
 *  
 * 
 */
package com.collections.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Collection003 {
	public static void main(String[] args) {
		
		//1. Java LinkedList Example
		/*
		 LinkedList<String> al=new LinkedList<String>(); 
		 
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  
		  Iterator<String> itr=al.iterator(); 
		  System.out.println("****************************");
		  while(itr.hasNext()){  
			  System.out.println(itr.next());  
		  }
		  
		  System.out.println("****************************");
		  for(int i=0; i<al.size(); i++) {
			  System.out.println(al.get(i));
		  }
		  
		  System.out.println("****************************");
		  for(String l:al) {
			  System.out.println(l);
		  }
		  */
		
		//2. LinkedList with student class
			
		/*
		Student s1=new Student(101,"Prahaash",23);  
		Student s2=new Student(102,"Chaithanya",21);  
		Student s3=new Student(103,"Priya",25);
		
		//LinkedList<Student> students = new LinkedList<>();
		
		List<Student> students = new LinkedList<>(); // List is interface 
		
		students.add(s1);
		students.add(s2);
		students.add(s3); 
		
		for(Student student:students) {
			System.out.println(student);
		}
		*/
		
		
		//3. ListIterator is used to traverse the element in backward and 
		//forward direction
		/*
		ArrayList<String> al=new ArrayList<String>();  
		
		al.add("Amit");  
		al.add("Vijay");  
		al.add("Kumar");  
		al.add(1,"Sachin"); 
		
		System.out.println("Element at 2nd position: "+al.get(2));  
		
		ListIterator<String> itr=al.listIterator();  
		
		System.out.println("Traversing elements in forward direction...");  	
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		
		System.out.println("Traversing elements in backward direction...");  
		while(itr.hasPrevious()){  
			System.out.println(itr.previous());  
		}
		*/
		
		
		//4. ListIterator Interface: Student
		
		Student s1=new Student(101,"Prahaash",23);  
		Student s2=new Student(102,"Chaithanya",21);  
		Student s3=new Student(103,"Priya",25);
		Student s4=new Student(104,"Rajesh",23);  
		Student s5=new Student(105,"Anish",21);  
		Student s6=new Student(106,"Raju",25);
		
		LinkedList<Student> students = new LinkedList<>();
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.add(s6);
		
				
		
		ListIterator<Student> itr = students.listIterator();
		
		
		System.out.println("Forward");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Backward");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	
		
		System.out.println("+++++++++++++++++++++++++++++");
		
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		
		
		System.out.println("Reverse: " + itr.previous());
		
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		
		
		System.out.println("+++++++++++++++++++++++");
		
		System.out.println(itr.previous());
		System.out.println(itr.previous());
		System.out.println(itr.previous());
		
		System.out.println("Forward: " + itr.next());
		
		System.out.println(itr.previous());
		System.out.println(itr.previous());
		System.out.println(itr.previous());
		
		
	}
}
