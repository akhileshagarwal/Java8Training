package com.kronos.training.methodReference;

import java.util.List;
import java.util.function.DoubleFunction;

import com.kronos.training.lambda.exercise.Employee;

public class DoubleFunctiontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeUtility utility=new EmployeeUtility();
		DoubleFunction<List<Employee>> doubleFunction=utility::findBySalary;
		List<Employee> above5000List=doubleFunction.apply(5);
		above5000List.stream().forEach(System.out::println);

	}

}
