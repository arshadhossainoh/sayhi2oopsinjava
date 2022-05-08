package com.in28minutes.oops;

public class Book {
	//state
	private int noOfCopies;

	//constructor
	
	Book(int noOfCopies){
		this.noOfCopies = noOfCopies;
	}
	
	
	
	//behavior
	
	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	
	public void increaseCopies(int howMuch) {
		this.noOfCopies += howMuch;
	}
	
	
	

}
