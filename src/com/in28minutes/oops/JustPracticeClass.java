package com.in28minutes.oops;

public class JustPracticeClass {
	private int id;	
	private String name;
	private boolean is_Student;
	
	
	JustPracticeClass(int id, String name, boolean is_Student){
		this.id=id;
		this.name=name;
		this.is_Student=is_Student;
		
	}

	
	public String toString() {
		return id+" "+name+" "+is_Student;
	}
	
	
}
