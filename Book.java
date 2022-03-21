package com.collections.demo;

public class Book  implements Comparable<Book> {
	private int bookid;  
	private String name,author,publisher;  
	private int quantity;

	public Book() {
		
	}
	
	public Book(int bookid, String name, String author, String publisher, int quantity) {  
	    this.bookid = bookid;  
	    this.name = name;  
	    this.author = author;  
	    this.publisher = publisher;  
	    this.quantity = quantity;  
	}

	public int getBookId() {
		return bookid;
	}

	public void setBookId(int bookid) {
		this.bookid = bookid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public int compareTo(Book b) {
		
		/*
		if(bookid > b.bookid) {
			return 1;
		}
		else if(bookid < b.bookid){
			return -1;
		}
		else {
			return 0;
		}
		*/
		
		/*
		if(quantity > b.quantity) {
			return 1;
		}
		else if(quantity < b.quantity) {
			return -1;
		}
		else{
			return 0;
		}
		*/
		
		return name.compareTo(b.name);
		
		/*
		if(quantity >= b.quantity) {
			return name.compareTo(b.name);
		}
		else if(quantity <= b.quantity) {
			return name.compareTo(b.name);
		}
		else {
			return name.compareTo(b.name);
		}
		*/
			//return name.compareTo(b.name);
		//}
		//else if(quantity <= b.quantity) {
			/*if(name.compareTo(b.name) > 1) {
				return 1;
			}
			else if(name.compareTo(b.name) < 1) {
				return -1;
			}
			else {
				return 0;
			}*/
			
			//return name.compareTo(b.name);
		//}
		//else {
			//return 0;
		//}
		
		/*
		if(name.compareTo(b.name) > 1) {
			return 1;
		}
		else if(name.compareTo(b.name) < 1) {
			return -1;
		}
		else {
			return 0;
		}
		*/
		
	}
	
	/*
	@Override
	public int compareTo(Book b) {  
	    if(id>b.id){ // < ascending, > descending  
	        return 1;  
	    }
	    else if(id<b.id){  
	        return -1;  
	    }
	    else{  
	    	return 0;  
	    } 
		
		
		//if(quantity > b.quantity)
		//		return 1;
		//else if(quantity < b.quantity)
		//		return -1;
		//else
		//	return 0;
			
	}
	*/
	
	@Override
	public String toString() {
		return "Book [id=" + bookid + ", name=" + name + ", author=" + author
				+ ", publisher=" + publisher + ", quantity=" + quantity + "]";
	} 
	
	
}
