package com.in28minutes.oops;

public class StringRunner {

	public static void main(String[] args) {
		String []daysofWeek = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
		
		
		String daywithmostCharacters ="";
		
		for(String e:daysofWeek) {
			if(e.length()>daywithmostCharacters.length()) {
				daywithmostCharacters = e ;
			}
		}
          System.out.println(daywithmostCharacters); 
          
          for(int i=daysofWeek.length-1; i>=0; i--) {
        	  System.out.print(daysofWeek[i]+" ");
          }
         
	}

}
