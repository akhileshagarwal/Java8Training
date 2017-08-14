package com.kronos.training.builtinfunctional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.kronos.training.constructorreference.Customer;
import com.kronos.training.constructorreference.CustomerFactory2;

class CustomerUtility{
	static boolean isVIPCustomer(Customer c){
		return c.getBalance()>1000;
	}
}

public class PredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> list=new ArrayList<>();
		CustomerFactory2 cf2=Customer::new;
		
		list.add(cf2.getCustomer(1, "Akhilesh",100) );
		list.add(cf2.getCustomer(2, "Arun",1000));
		list.add(cf2.getCustomer(3, "Shuchita",10000));
		Predicate<Customer> filter=c->c.getBalance()>100;
		list.stream().filter(filter).forEach(System.out::println);
		
		System.out.println("Listing out VIPs");
		list.stream().filter(CustomerUtility::isVIPCustomer).forEach(System.out::println);
	}

}
