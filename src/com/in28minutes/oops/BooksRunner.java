package com.in28minutes.oops;

public class BooksRunner {

	public static void main(String[] args) {
	   Books book = new Books(123, "OOP with Java", "Ken");
	   book.addReview(new Review(10, "Great Book", 5));
	   book.addReview(new Review(8, "Awesome", 5));
	   
	   System.out.println(book);
	   
	}

}
