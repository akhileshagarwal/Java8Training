package com.kronos.training.constructorreference;

public class Constructorreference {

	public static void main(String[] args) {
		CustomerFactory cf1=Customer::new;
		System.out.println(cf1.getCustomer());
		
		CustomerFactory2 cf2=Customer::new;
		System.out.println(cf2.getCustomer(1, "Akhilesh",100));
		
		CustomerFactory3 cf3=Customer::new;
		System.out.println(cf3.getCustomer(2, "Shcuhita"));

	}

}
