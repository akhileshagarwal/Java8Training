package com.kronos.training.builtinfunctional;

import java.util.Arrays;
import java.util.List;

import com.kronos.training.lambda.exercise.Employee;
import com.kronos.training.methodReference.EmployeeUtility;



public class ToDoubleFunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(101,102,103,104);
		EmployeeUtility utility=new EmployeeUtility();
		double sum=list.stream().map(utility::getEmployee).mapToDouble(Employee::getSalary).sum();
		System.out.println("Sum of salary of all the employees: "+sum);
	}

}
