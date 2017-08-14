package com.kronos.training.groupby;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.kronos.training.lambda.exercise.Employee;
import com.kronos.training.methodReference.EmployeeUtility;

public class GroupByTest {
	public static void main(String[] args) {
		EmployeeUtility utility = new EmployeeUtility();
		Collection<Employee> list = utility.getAllEmployee();
		Map<String, List<Employee>> map=list.stream().collect(Collectors.groupingBy(e->e.getDesignation()));
		System.out.println("All Employees");
		list.forEach(employee->System.out.println(employee));
		System.out.println("\nEmployee grouped by designation");
		map.keySet().stream().forEach(designation->{
			map.get(designation).forEach(System.out::println);
		});
		System.out.println("\nEmployee partitioned by salary");
		Map<Boolean,List<Employee>> map1=list.stream().collect(Collectors.partitioningBy(e->e.getSalary()>1000));
		
		map1.get(true).forEach(System.out::println);
	}
}
