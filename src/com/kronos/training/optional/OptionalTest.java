package com.kronos.training.optional;

import java.util.Optional;

import com.kronos.training.lambda.exercise.Employee;
import com.kronos.training.methodReference.EmployeeUtility;

public class OptionalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeUtility utility = new EmployeeUtility();
		Optional<Employee> e=utility.findEmployee(100);
		System.out.println(e.isPresent());
	}

}
