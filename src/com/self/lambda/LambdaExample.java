package com.self.lambda;

import java.util.ArrayList;
import java.util.List;

import com.kronos.training.lambda.exercise.Employee;
import com.kronos.training.methodReference.EmployeeUtility;

public class LambdaExample {
	
	

	public static void main(String[] args) {
		EmployeeUtility utility=new EmployeeUtility();
		listEmployess(new ArrayList(utility.getAllEmployee()), new LeadEmployee());
		listEmployess(new ArrayList(utility.getAllEmployee()), new SeniorEmployee());

	}
	
	public static void listEmployess(List<Employee> list,EmployeePredicate predicate){
		list.forEach(emp-> {
			if(predicate.accept(emp)){
				System.out.println(emp);
			}
		});
	}

}
