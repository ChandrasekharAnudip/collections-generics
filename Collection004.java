/*
 * 
 * Java HashSet class
 * 
 * 
 * Java HashSet class hierarchy
 * 
 * Java HashSet class is used to create a collection that uses a hash table 
 * for storage. 
 * 
 * It inherits the AbstractSet class and implements Set interface.
 * 
 * The important points about Java HashSet class are:
 * 
 * 1. HashSet stores the elements by using a mechanism called hashing.
 * 2. HashSet contains unique elements only.
 * 
 * Difference between List and Set
 * 
 * List can contain duplicate elements whereas Set contains unique elements only.
 * 
 * Hierarchy of HashSet class
 * 
 * The HashSet class extends AbstractSet class which implements Set interface. 
 * 
 * The Set interface inherits Collection and Iterable interfaces in 
 * hierarchical order.
 * 
 * 
 * Java LinkedHashSet class
 * 
 * Java HashSet class hierarchy
 * 
 * Java LinkedHashSet class is a Hash table and Linked list implementation 
 * of the set interface. 
 * 
 * It inherits HashSet class and implements Set interface.
 * 
 * 
 * The important points about Java LinkedHashSet class are:
 * 
 * 1. Contains unique elements only like HashSet.
 * 2. Provides all optional set operations, and permits null elements.
 * 3. Maintains insertion order.
 * 
 * Hierarchy of LinkedHashSet class
 * 
 * The LinkedHashSet class extends HashSet class which implements Set interface.
 * The Set interface inherits Collection and Iterable interfaces in hierarchical 
 * order.
 * 
 * 
 * Java TreeSet class
 * 
 * TreeSet class hierarchy
 * 
 * Java TreeSet class implements the Set interface that uses a tree for storage. 
 * 
 * It inherits AbstractSet class and implements NavigableSet interface. 
 * 
 * The objects of TreeSet class are stored in ascending order.
 * 
 * 
 * The important points about Java TreeSet class are:
 * 
 * 1. Contains unique elements only like HashSet.
 * 2. Access and retrieval times are quiet fast.
 * 3. Maintains ascending order.
 * 
 * Hierarchy of TreeSet class
 * 
 * Java TreeSet class implements NavigableSet interface. 
 * 
 * The NavigableSet interface extends SortedSet, Set, Collection and Iterable 
 * interfaces in hierarchical order.
 * 
 * 
 * The elements in TreeSet must be of Comparable type. 
 * 
 * String and Wrapper classes are Comparable by default. 
 * 
 * To add user-defined objects in TreeSet, you need to implement Comparable 
 * interface.
 * 
 * 
 */
package com.collections.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collection004 {
	public static void main(String[] args) {
		
		//1. Java HashSet Example
		
		//Creating HashSet and adding elements  
		  /*HashSet<String> set=new HashSet<String>();  
		  
		  set.add("Zansi");
		  set.add("Ajay"); 
		  set.add("Ravi");  
		  set.add("Vijay");  
		  set.add("Ravi"); // duplicate elements will not be stored in set
		 
		  
		  //Traversing elements  
		  Iterator<String> itr=set.iterator();  
		  
		  while(itr.hasNext()){  
			  System.out.println(itr.next()); // Duplicate elements will not be displayed  
		  }
		*/
		
		
		//2. Student class with HashSet
		/*
		Student s1=new Student(101,"Prahaash",23);  
		Student s2=new Student(102,"Chaithanya",21);  
		Student s3=new Student(103,"Priya",25);
		
		Student s4=s1;
		
		HashSet<Student> students = new HashSet<>();
		
		students.add(s1);
		students.add(s2);
		students.add(s3); 
		students.add(s4); // Duplicate elements will not be displayed
		
		students.add(null);
		students.add(null);
		students.add(s2);
		
		
		for(Student student:students) {
			System.out.println(student);
		}
		
		*/
		
		
		//3. Example of LinkedHashSet
		/*
		 LinkedHashSet<String> al=new LinkedHashSet<String>();  
		
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");
		  al.add(null);
		  
		  Iterator<String> itr=al.iterator();  
		  
		  while(itr.hasNext()){  
			  System.out.println(itr.next());  
		  }
		  */
		
		//4. Student class with LinkedHashSet
			/*	
				Student s1=new Student(101,"Prahaash",23);  
				Student s2=new Student(102,"Chaithanya",21);  
				Student s3=new Student(103,"Priya",25);
				
				Student s4=s1;
				
				LinkedHashSet<Student> students = new LinkedHashSet<>();
				
				students.add(s1);
				students.add(s2);
				students.add(s3); 
				students.add(s4); // Duplicate elements will not be displayed
				
				for(Student student:students) {
					System.out.println(student);
				}
		
		*/
		//5. Java TreeSet class
		
		//Creating and adding elements  
		 /*
		TreeSet<String> al=new TreeSet<String>();  
		  
		  // displays in ascending order
		  // removes duplicates
		  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay"); 
		  al.add("ravi");
		  
		  //Traversing elements  
		  Iterator<String> itr=al.iterator();  
		  
		  while(itr.hasNext()){  
			  System.out.println(itr.next());  
		  }  
		  */
		/*
		TreeSet<Integer> al = new TreeSet<>();
		
		al.add(523);
		al.add(423);
		al.add(323);
		al.add(223);
		al.add(123);
		al.add(323);
		
		for(Integer n:al) {
			System.out.println(n);
		}
		*/

		
		//6. Java TreeSet Example: Book
		
		
		// This code will not work becuase Student class does not implements Comparable
		
		
		/*
		TreeSet<Student> al = new TreeSet<>();
		
		Student s1=new Student(101,"Prahaash",23);  
		Student s2=new Student(102,"Chaithanya",21);  
		Student s3=new Student(103,"Priya",25);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Iterator<Student> itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
			*/	
		
		
		Set<Book> set=new TreeSet<Book>();
		
		
	    //Creating Books  
	    
		Book b1=new Book(121,"Professional C#","Mike Schrower","BPB",8);  
	    Book b2=new Book(233,"Operating System","Galvin","Wiley",4);  
	    Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",2);  
	    
	    //Adding Books to TreeSet  
	    set.add(b1);  
	    set.add(b2);  
	    set.add(b3);  
	    
	    //Traversing TreeSet  
	    for(Book b:set){  
	    	System.out.println(b.getBookId() + " " + b.getName() +" " 
	    				+ b.getAuthor() + " " + b.getPublisher() + " " 
	    				+ b.getQuantity());  
	    } 
	    
		
	    
	    Iterator<Book> itr = set.iterator();
	    
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	    
		
	}
}
