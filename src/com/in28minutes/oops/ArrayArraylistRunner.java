package com.in28minutes.oops;

import java.math.BigDecimal;

public class ArrayArraylistRunner {

	public static void main(String[] args) {
		
		//int []marks = {98,99,100}; used variable argument
		
		Student student = new Student("arshad", 103, 107, 100);
		int num = student.getNumofMarks();
		int sum = student.getSumofMarks();
		int maxMark = student.getMaxMark();
		int minMark = student.getMinMark();
		BigDecimal average = student.getAvgMark();
		student.addNewMark(35);
		System.out.println(student);
		student.rmvMarkAtIndex(1);
		System.out.println(student);
		
		
		
		System.out.println(maxMark);
		System.out.println(minMark);
		System.out.println(average);
		
		
		
		
		
		

	}

}
