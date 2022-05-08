package com.in28minutes.oops;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
      private String name;
      private ArrayList<Integer>marks = new ArrayList<Integer>();
      
      // Constructor and variable arguments 
      
      Student(String name, int...marks){
    	  this.name = name;
    	  
    	  for(int e:marks) {
    		  this.marks.add(e);
    	  }
      }



	public int getNumofMarks() {
		return marks.size();
	}



	public int getSumofMarks() {
		int sum =0;
		for(int e:marks) {
			sum = sum + e;
		}
		return sum;
	}



	/*public int getMaxMark() {
		int max =Integer.MIN_VALUE;
		
		for (int e:marks) {
			if(e>max) {
				max =e;
			}
		}

		return max;
	}*/
	public int getMaxMark() {
		return Collections.max(marks);
	}



	/*public int getMinMark() {
     int min =Integer.MAX_VALUE;
		
		for (int e:marks) {
			if(e<min) {
				min =e;
			}
		}
		return min;
	}*/
	
	public int getMinMark() {
		return Collections.min(marks);
	}


	public BigDecimal getAvgMark() {
		int sum = getSumofMarks();
		int num = getNumofMarks();
		return new BigDecimal(sum).divide(new BigDecimal(num), 3, RoundingMode.UP) ;
	}
	
	
	public String toString() {
		return name + marks;
	}



	public void addNewMark(int mark) {
		marks.add(mark);	
	}



	public void rmvMarkAtIndex(int index) {
		marks.remove(index);	
	}
	
	
	
	
	
}
