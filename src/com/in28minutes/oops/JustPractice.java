package com.in28minutes.oops;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.xml.stream.util.EventReaderDelegate;

public class JustPractice {
    
	public static String fizzbuzz(int num) {
		String result = "";
		
		if(num%3==0 && num%5==0) {
			result += "fizzbuzz";
		}
		else if(num%3==0) {
			result += "fizz";
		}
		else if(num%5==0) {
			result += "buzz";
		}
		else {
			result += num;
		}
		return result;
	}
	
	
	
	
	public static void main(String[] args) {
		
		
	System.out.println(fizzbuzz(7));
		
		
		
		
		
		
		
		
	}
    
} 