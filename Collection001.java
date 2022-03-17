/* Collections
 * 
 * A collection is an object that can hold other objects. 
 * 
 * Collections are similar to arrays, but are more flexible to use 
 * and are more efficient than arrays for many applications
 * 
 * Interfaces
 * 
 * 1. Collection ==> Defines the basic methods available for all collections.
 * 
 * 2. Set ==> Defines a type of collection in which no duplicate 
 * 			   elements are allowed.
 * 
 * 3. List ==> Defines a type of collection that maintains the order in which 
 * 			   elements were added to the list.
 * 
 * 4. Map ==> Defines a map, which is similar to a collection but holds 
 * 			  one or more key value pairs instead of simple elements. 
 * 			  Each key-value pair consists of a key that uniquely identifies 
 * 			  an entry and a value that provides data associated with a 
 * 			  particular key.
 * 
 * Classes:
 * 
 * 1. ArrayList ==> Works much like an array, but can be easily expanded to 
 * 					accommodate new elements. 
 * 
 * 					Very efficient for accessing individual elements in random 
 * 					sequence, but inserting elements into the middle of the list
 * 					can be inefficient.
 * 
 * 2. LinkedList ==> Similar to an array list, but with more features. 
 * 
 * 					Less efficient than an array list for accessing elements 
 * 					randomly, but more efficient when inserting items into the 
 * 					middle of the list.
 *  
 * 3. HashSet ==> Stores a set of unique values based on a hash code. 
 * 
 * 				Duplicates are not allowed. 
 * 
 * 				Objects you add to a hash set must implement a method called 
 * 				hashCode to generate a hash code for the object, which is 
 * 				used to ensure uniqueness.
 * 
 * 4. HashMap ==> Similar to a hash set, but is based on the Map interface rather 
 * 				than the Set interface. 
 * 
 * 				As a result, a hash map stores key-value pairs whose keys must 
 * 				be unique.
 * 
 * 5. TreeMap ==> Stores key-value pairs in a special arrangement called a tree. 
 * 
 * 				Entries in a tree map are automatically maintained in key sequence.
 * 
 * 
 * The Java collection framework is interface based, which means that each 
 * class in the collection implements one of the interfaces defined by the 
 * collection framework.
 * 
 * The collection framework consists of two class hierarchies: Collection and Map.
 *  
 * Collections store individual objects as elements. 
 * 
 * Maps store pairs of key objects and value objects in a way that lets 
 * you retrieve a value object based on its key.
 * 
 * Although there are many classes in the Java collection framework, the most 
 * commonly used classes are the ArrayList, LinkedList, HashSet, HashMap, 
 * and TreeMap classes.
 * 
 * Generics
 * 
 * Prior to Java 1.5, the elements of a collection were defined as type Object. 
 * 
 * As a result, you could store any type of object as an element in a collection. 
 * 
 * At first, this flexibility might seem like an advantage. But with it comes two 
 * disadvantages. 
 * 
 * First, there’s no way to guarantee that only objects of a certain type are 
 * added to a collection. For example, you can’t limit an ArrayList so it can 
 * hold only Product objects. 
 * 
 * Second, you must use casting whenever you retrieve an object from a collection. 
 * That’s because an element can be any type of object. For example, to retrieve 
 * a Product object from a collection, you must cast the object to a Product.
 * 
 * 
 * 
 * Java 1.5 introduced a new feature called generics that addresses these two 
 * problems. 
 * 
 * The generics feature lets you specify the element type for a collection. Then, 
 * Java can ensure that only objects of the specified type are added to the 
 * collection. 
 * 
 * And any objects you retrieve from the collection are automatically cast to 
 * the correct type.
 * 
 * To specify a type when you declare a collection, you code the type in angle 
 * brackets immediately following the name of the collection class 
 * (such as ArrayList or LinkedList).
 * 
 * 		
 * Prior to Java 1.7, you had to do this twice: once when you use the collection 
 * class to declare the collection, and again when you use the constructor 
 * of the collection class to create an instance of the collection as 
 * shown below
 * 
 * 	ArrayList<String> names = new ArrayList<String>();
 * 
 * 
 * From Java 1.7, you can do the same as shown in the following example
 * 
 *  		ArrayList<String> names = new ArrayList<>();
 *  
 *  
 */
package com.collections.demo;

import java.util.ArrayList;
import java.util.List;


public class Collection001 {
	public static void main(String[] args) {
	
		
		//1. By Arrays
		/*
		String[] degrees = new String[3];
		
		degrees[0] = "mbbs";
		degrees[1] = "be";
		degrees[2] = "btech";
		
		//degrees[3] = "ba";
		//degrees[2] = 100;
		
		for(int i=0; i<degrees.length; i++) {
			System.out.println(degrees[i]);
		}
		System.out.println("******************************");
		
		for (String degree : degrees)
			System.out.println(degree);
		*/
		
							
		//2. By Collection
		
		
		/*
		ArrayList degrees = new ArrayList();
		
		degrees.add("mbbs");
		degrees.add("be");
		degrees.add("btech");
		degrees.add("bcom");
		
		degrees.add(123);
		degrees.add(123.45);
		
		Book b = new Book(101,"Professional Java","Ramesh","Wrox", 20);
		
		degrees.add(b);
		
		
		for(Object degree : degrees) {
			System.out.println(degree);
		}
		
		System.out.println(degrees);
		
		
		*/
		
		//3. By Generic Collection -- String
		/*
		ArrayList<String> degrees = new ArrayList<String>();
		//List<String> degrees = new ArrayList<>();
		degrees.add("mbbs");
		degrees.add("be");
		degrees.add("btech");
		
		
		//degrees.add(123);
		//degrees.add(new Book());
		
		
		for(String degree : degrees) {
			System.out.println(degree);
		}
		
		*/
		
		//4. By Generic Collection -- String
	
		/*
		ArrayList<String> degrees = new ArrayList<String>();
		
		degrees.add("mbbs");
		degrees.add("be");
		degrees.add("btech");
		
		
		for(int i=0; i<degrees.size(); i++) {
			String degree = degrees.get(i); // degrees[i]
			System.out.println(degree);
		}
		
		
		System.out.println("++++++++++++++++++++++++++++++");
		
		// Another way to display the values
		System.out.println(degrees);
		System.out.println("++++++++++++++++++++++++++++++");
		
		
		// Code that replaces and deletes objects
		degrees.set(1, "ba"); 
		
		System.out.println(degrees) ;
		System.out.println("++++++++++++++++++++++++++++++");
		
		
		//degrees.remove("btech"); 
		degrees.remove(1) ;
		
		System.out.println(degrees) ;
		System.out.println("++++++++++++++++++++++++++++++");
		
		*/
		
		
		
		//5. By Generic Collection -- int
		
		//ArrayList<int> numbers = new ArrayList<int>();
		
		/*
		Primitive types ====> extended types or wrapper
		int						Integer
		float					Float
		boolean					Boolean
		*/
		
		
		//Code that uses an array list of type Integer
		/*
		ArrayList<Integer> numbers = new ArrayList<>();
		
		// we should not use int type here. 
		// Collections will not support primitive types
		
		// we cant use primitive types like int, float etc
		
		numbers.add(1); 
		numbers.add(2); 
		numbers.add(3 ) ;
		
		System.out.println(numbers);
		
		for(Integer number:numbers) {
			System.out.println(number);
		}
		
		
		for(Integer i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		*/	
		//6. Different datatypes 
		
		/*
		ArrayList list = new ArrayList();
		
		list.add(123);
		list.add("Anish");
		list.add("Anish");
		list.add(new Student(101, "Ramesh", 45));
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("+++++++++++++++++++++++++");
		
		for(Object i:list) {
			System.out.println(i);
		}
		*/
		
		
		//7. Adding different type into a generic collection
		/*
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ramesh");
		list.add("Anish");
		list.add("Prahaash");
		list.add("Chaithanya");
		
		//list.add(112);
		  
		  for(String name:list) {
			System.out.println(name);
		}
		*/
		
		//8. Adding an int and Integer to generic collection 
		
		
		//ArrayList<int> list = new ArrayList<int>();
		
		/*
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(123);
		list.add(111);
		list.add(333);
		list.set(2, 222);
		list.add(444);
		
		for(Integer value:list) {
			System.out.println(value);
		}
		*/
	}

}
