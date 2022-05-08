package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike ducati = new MotorBike(100);
		MotorBike honda = new MotorBike(70);
		MotorBike something = new MotorBike();
		
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(something.getSpeed());
		
		ducati.start();
		honda.start();

		
		ducati.increaseSpeed(50);
		honda.increaseSpeed(20);
		something.increaseSpeed(50);
		
		ducati.decreaseSpeed(30);
		honda.decreaseSpeed(30);
		
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		System.out.println(something.getSpeed());
		
		
		
		
	}

}
