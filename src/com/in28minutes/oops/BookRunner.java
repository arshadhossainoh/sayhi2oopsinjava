package com.in28minutes.oops;

public class BookRunner {

	public static void main(String[] args) {
		//create 3 instances
		
		Book artofCp = new Book(30);
		Book effectiveJava = new Book(50);
		Book cleanCode = new Book(70);
		
		
		artofCp.increaseCopies(100);
		
	
		System.out.println(artofCp.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
		

	}

}
