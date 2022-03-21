package com.collections.demo;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Collection005 {
	public static void main(String[] args) {
		
		//1. LinkedList non generic
		/*
		List names = new LinkedList();
		
		names.add("Rams");
		names.add("Posa");
		names.add("Chinni");
	    names.add(2011);
				
		System.out.println("LinkedList content: " + names);
		System.out.println("LinkedList size: " + names.size());
		*/
		
		//2. LinkedList <T> generic
		/*
		List<String> names = new LinkedList<>();
		
		names.add("Rams");
		names.add("Posa");
		names.add("Chinni");
	    // We cannot add other than Strings
	    //names.add(2011);
				
		System.out.println("LinkedList content: " + names);
		System.out.println("LinkedList size: " + names.size());
		*/
		
		//3. Java Array to LinkedList
		
		/*
		int[] numbers = {1,2,3,4,5};
		
		
		//Integer[] numbers = {1,2,3,4,5};
		
		//List<int> numbersList = new LinkedList<>();
		
		List<Integer> numbersList = new LinkedList<>();
		
		
		
		for(Integer n : numbers){
			numbersList.add(n);
		}
		
		
		System.out.println(numbersList);
		*/
		
		
		
		//4. Java LinkedList to Array
		/*
		List<Integer> numbersList = new LinkedList<>();
		
		numbersList.add(1);
		numbersList.add(2);
		numbersList.add(3);
		numbersList.add(4);
		numbersList.add(5);
		numbersList.add(8);
		
		Integer[] numbers = new Integer[numbersList.size()];
		
		//int[] numbers = new int[numbersList.size()]; // we cant pass this
		
		numbersList.toArray(numbers);
		
		
		System.out.println(numbers);
		
		//System.out.println(numbersList);
		
		
		
		System.out.print("[ ");
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i] + " ,");
		}
		System.out.print(" ]");
		
		
		System.out.println("\n" + Arrays.toString(numbers));
		*/
		
		//5. Java LinkedList Deque (removing) Operations 
		/*
		//List<Integer> nums = new LinkedList<>(); // Will not work
		
		//LinkedList<Integer> nums = new LinkedList<>(); // will work
		
		
		Deque<Integer> nums = new LinkedList<>();
		
		nums.add(2);
		nums.addFirst(1);
		nums.addLast(3);
		nums.addFirst(0);
		nums.addLast(4);
		nums.add(10);
				
		System.out.println("LinkedList content: " + nums);
		System.out.println("LinkedList size: " + nums.size());
		
		
		nums.remove();
		nums.remove();
		nums.removeFirst();
		nums.removeLast();
		
		System.out.println("LinkedList content: " + nums);
		System.out.println("LinkedList size: " + nums.size());	
		
		*/
		
		
		
		//6. LinkedList <T> generic (another example)
	
		// Creating object of class linked list
        
		LinkedList<String> object = new LinkedList<String>();
 
        // Adding elements to the linked list
       
		object.add("A");
        object.add("B");
        object.addLast("C");
        object.addFirst("D");
        object.add(2, "E");
        object.add("F");
        object.add("G");
        
        System.out.println("Linked list : " + object);
 
        // Removing elements from the linked list
        
        object.remove();
       
        
        object.remove("B");
        
        System.out.println("Linked list : " + object);
        
        
        object.remove(3);
        
        System.out.println("Linked list : " + object);
        
        
        object.removeFirst();
        
        System.out.println("Linked list : " + object);
        
        object.removeLast();
        
        System.out.println("Linked list after deletion: " + object);
 		
        
        
        // Finding elements in the linked list
        boolean status = object.contains("E");
 
        if(status)
            System.out.println("List contains the element 'E' ");
        else
            System.out.println("List doesn't contain the element 'E'");
        
        
        status = object.contains("X");
        
        if(status)
            System.out.println("List contains the element 'X' ");
        else
            System.out.println("List doesn't contain the element 'X'");
        
        // Number of elements in the linked list
 
        int size = object.size();
        
        System.out.println("Size of linked list = " + size);
 
        // Get and set elements from linked list
        //Object element = object.get(2); //Simple collection
        //or
        
        String element = object.get(1);// Generic collection
        
        System.out.println("Element returned by get() : " + element);
        object.set(1, "Y");
        System.out.println("Linked list after change : " + object);
       
	}

}
