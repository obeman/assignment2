package test;

import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner p = new Scanner(System.in);
		System.out.println("enter name");
		String name = p.nextLine();
		
		Customer cust = new Customer(1, name, "personal");
		
//		Address add = new Address("1", "Jl sudirman 31 raya", "14240", "jakarta", "08927384");
		
				
		cust.setAddress(new Address("1", "Jl sudirman 31 raya", "14240", "jakarta", "08927384"));

		
		cust.info(cust);
		
		
		
	}
}
