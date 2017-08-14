package com.kronos.training.constructorreference;

interface CustomerFactory {

	Customer getCustomer();
}

 public interface CustomerFactory2 {

	Customer getCustomer(int id, String name, int balance);
}

interface CustomerFactory3 {

	Customer getCustomer(int id, String name);
}
