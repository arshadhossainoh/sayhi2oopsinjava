package com.in28minutes.oops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsCollectionRunner {

	public static void main(String[] args) {
		
		List<StudentCollection>students = List.of(new StudentCollection(1, "Ranga"),
				new StudentCollection(100, "Adam"),
				new StudentCollection(2, "Eve"));
		
		
		List<StudentCollection> studentsAl = new ArrayList<>(students);
		
		System.out.println(studentsAl);
		
		Collections.sort(studentsAl);
		System.out.println(studentsAl);
		

	}

}
