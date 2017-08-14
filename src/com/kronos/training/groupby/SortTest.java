package com.kronos.training.groupby;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.kronos.training.lambda.exercise.Employee;
import com.kronos.training.methodReference.EmployeeUtility;

public class SortTest {

	public static void main(String[] args) {
		EmployeeUtility utility = new EmployeeUtility();
		Collection<Employee> list = utility.getAllEmployee();
		// without using comparing
		List<Employee> newList = list.stream().sorted((e1, e2) -> e1.getSalary().compareTo(e2.getSalary()))
				.collect(Collectors.toList());
		newList.forEach(emp->System.out.println(emp));
		System.out.println();

		// using comparing with lambda
		System.out.println("Sorting based on Designation using lambda");
		newList = list.stream().sorted(Comparator.comparing(e -> e.getDesignation())).collect(Collectors.toList());

		newList.forEach(emp->System.out.println(emp));

		// using comparing and method reference
		System.out.println("Sorting based on Designation using method reference");
		newList = list.stream().sorted(Comparator.comparing(Employee::getDesignation)).collect(Collectors.toList());

		newList.forEach(emp->System.out.println(emp));

		// using then comparing in case two employee have same designation
		System.out.println("Sorting based designation and then salary");
		newList = list.stream()
				.sorted(Comparator.comparing(Employee::getDesignation).thenComparing(Employee::getSalary))
				.collect(Collectors.toList());

		newList.forEach(emp->System.out.println(emp));
	}

}
