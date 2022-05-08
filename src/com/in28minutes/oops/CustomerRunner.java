package com.in28minutes.oops;

public class CustomerRunner {

	public static void main(String[] args) {
		
		Address homeAddress = new Address("line 1", "Dhaka", "1212");
		Customer customer = new Customer("Ranga", homeAddress);
		
		Address workAddress = new Address("line 1 for work", "Dhaka", "12128");
		customer.setWorkAddress(workAddress);
		

		System.out.println(customer);
		
		
		
	}

}
