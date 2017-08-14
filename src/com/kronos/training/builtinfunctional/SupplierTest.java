package com.kronos.training.builtinfunctional;

import java.util.function.Supplier;

import com.kronos.training.constructorreference.Customer;


class KeyGenerator{
	public String keyGenerator(){
		return new StringBuilder().append("Private Key:").append(System.getProperty("private"))
				.append(" Public Key:").append(System.getProperty("private")).toString();
	}
}
public class SupplierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyGenerator kg=new KeyGenerator();
		Supplier<String> keypair=kg::keyGenerator;
		System.out.println(keypair.get());
		Supplier<Customer> object=Customer::new;
		System.out.println(object.get());
		

	}

}
