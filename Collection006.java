/*
 * 
 * Java Collections class is used exclusively with static methods that operate 
 * on or return collections. It inherits Object class.

The important points about Java Collections class are:

Java Collections class supports the polymorphic algorithms that operate on 
collections.

Java Collections class throws a NullPointerException if the collections or 
class objects provided to them are null.

 * 
 * 
 */
package com.collections.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Collection006 {
	public static void main(String[] args) {
		
		//1.Java Collections Example
		/*
		List<String> list = new ArrayList<String>();
		//List list = new ArrayList();
        
		list.add("C");  
        list.add("Core Java");  
        list.add("Advanced Java");  
        
        System.out.println("Initial collection values:"+list);  
        
        //list.add("Servlet");
        //list.add("JSP");
        
        //Collections col11 = new Collections();
        
        
        Collections.addAll(list, "Servlet","JSP");  
        
        System.out.println("After adding elements, collection values:"+list);  
        
        String[] strArr = {"C#", ".Net"};  
        
        Collections.addAll(list, strArr);  
        
        System.out.println("After adding array, collection values:"+list);  
		
        //Collections.addAll(list, 10,20,30);
	
        //System.out.println("After adding array, collection values:"+list);
		*/
		
		
		//2. Java Collections Example: max() and min()
		/*
		List<Integer> list = new ArrayList<Integer>();  
		
		list.add(46);  
		list.add(67);
		list.add(24);  
		list.add(16);  
		list.add(8);  
		list.add(12);  
		
		System.out.println("Value of maximum element from the collection: " 
		+ Collections.max(list));
		
		System.out.println("Value of minimum element from the collection: "  + 
		Collections.min(list));
		
		*/
		
		//3. sorting List elements
		
		/*
		ArrayList<String> al=new ArrayList<String>();  
		
		al.add("Viru");  
		al.add("Saurav");  
		al.add("Mukesh");  
		al.add("Tahir");  
		  
		Collections.sort(al);
		
		
		Iterator<String> itr=al.iterator();  
		
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		
		
		System.out.println("After sorting: " + al);
		*/
		
		
		//4. Sorting customer objects by age
		/*
		ArrayList<Customer> al=new ArrayList<>();
		
		al.add(new Customer(101,"Vijay",23));  
		al.add(new Customer(106,"Ajay",27));  
		al.add(new Customer(105,"Jai",21));  
		 
		System.out.println("Before sorting: ");
		for(Customer cust:al){  
			System.out.println(cust.getNo()+" "+cust.getName()+" "+cust.getAge());  
		} 
		
		
		Collections.sort(al);
		
		System.out.println("After sorting: ");
		
		for(Customer cust:al){  
			System.out.println(cust.getNo()+" "+cust.getName()+" "+cust.getAge());  
		} 
		
	*/
		
		//5. Sorting programmer by age , name
		/*
		ArrayList al=new ArrayList();
		
		al.add(new Programmer(101,"Vijay",23));  
		al.add(new Programmer(106,"Ajay",27));  
		al.add(new Programmer(105,"Jai",21));  
		  
		System.out.println("Sorting by Name...");  
		
		Collections.sort(al,new NameComparator());  
		
		Iterator itr=al.iterator();  
		
		while(itr.hasNext()){  
			Programmer programmer=(Programmer)itr.next();  
			System.out.println(programmer);  
		}  
		  
		System.out.println("sorting by age...");  
		  
		Collections.sort(al,new AgeComparator());  
		
		Iterator itr2=al.iterator();  
		
		while(itr2.hasNext()){  
			Programmer programmer=(Programmer)itr2.next();  
			System.out.println(programmer);  
		} 
		*/
		
		// 6. Sorting customer by age , name by generic
		/*
		ArrayList<Programmer> al=new ArrayList<>();
		
		al.add(new Programmer(101,"Vijay",23));  
		al.add(new Programmer(106,"Ajay",27));  
		al.add(new Programmer(105,"Jai",21));  
		  
		System.out.println("Sorting by Name...");  
		
		Collections.sort(al,new GenericNameComparator());  
		
		Iterator<Programmer> itr=al.iterator();  
		
		while(itr.hasNext()){  
			//Programmer programmer=(Programmer)itr.next();  
			System.out.println(itr.next());  
		}  
		  
		System.out.println("sorting by age...");  
		  
		Collections.sort(al,new GenericAgeComparator());  
		
		Iterator<Programmer> itr2=al.iterator();  
		
		while(itr2.hasNext()){  
			//Programmer programmer=(Programmer)itr2.next();  
			System.out.println(itr2.next());  
		} 
		
		*/
		
		//7. Difference between ArrayList and Vector
		
		Vector<String> v=new Vector<String>();//creating vector
		
		  v.add("umesh");//method of Collection  
		  v.addElement("irfan");//method of Vector  
		  v.addElement("kumar");  
		  
		  //traversing elements using Enumeration  
		  
		  Enumeration<String> e=v.elements();  
		  
		  while(e.hasMoreElements()){  
			  System.out.println(e.nextElement());  
		  } 
		  
		  System.out.println("====================================");
		  
		  Iterator<String> itr = v.iterator();
		  
		  while(itr.hasNext()) {
			  System.out.println(itr.next());
		  }
		  
		  System.out.println("====================================");
		  
		  for(String name:v) {
			  System.out.println(name);
		  }
		  
	}

}
