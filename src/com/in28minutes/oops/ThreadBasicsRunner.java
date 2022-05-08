package com.in28minutes.oops;

//extend thread class or implement Runnable

class Task1 extends Thread{
	public void run() {
		System.out.println("\nTask1 started");
		for(int i=1; i<=5; i++) {
			System.out.print(i);
		}
		System.out.println("\ntask1 done");
		
	}
}

class Task2 implements Runnable{
	public void run() {
		System.out.println("\nTask2 started");
		for(int i=5; i<=10; i++) {
			System.out.print(i);
		}
		System.out.println("\ntask2 done");
	}
}

public class ThreadBasicsRunner {

	public static void main(String[] args) {
	
		//Task1
		System.out.println("\nTask1 kicked off");
		Task1 task1 = new Task1();
		task1.start();
		
		// Task2
		System.out.println("\nTask2 kicked off");
		Task2 task2 = new Task2();
		Thread task2thread = new Thread(task2);
		task2thread.start();
		
		
		// Task3
		
		for(int i=10; i<=15; i++) {
			System.out.print(i);
		}
		System.out.println("\ntask3 done");
		

	}

}
