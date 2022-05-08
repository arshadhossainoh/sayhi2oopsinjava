package com.in28minutes.oops;

import java.util.Scanner;

public class ConditionExamples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1: ");
		int num1 = sc.nextInt();
		
		System.out.println("enter num2: ");
		int num2 = sc.nextInt();
		
		System.out.println("Choices available are: ");
		System.out.println("1 - Add");
		System.out.println("2 - subtract");
		System.out.println("3 - multiply");
		
		System.out.println("enter your choice: ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1 : System.out.println(num1+num2); break;
		case 2 : System.out.println(num1-num2); break;
		default: System.out.println(num1*num2); break;
		}
		

	}

}
