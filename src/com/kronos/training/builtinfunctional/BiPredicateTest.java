package com.kronos.training.builtinfunctional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;

import com.kronos.training.lambda.exercise.Employee;
import com.kronos.training.methodReference.EmployeeUtility;



public class BiPredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<String, Employee> biPredicate=(des,e)->e.getDesignation().equals(des);
		EmployeeUtility utility=new EmployeeUtility();
		Collection<Employee> list=utility.getAllEmployee();
		for(Employee e:list){
			if(biPredicate.test("SSE", e)){
				System.out.println(e);
			}
		}
		List<Employee> employeeList=new ArrayList<>(list);
		BiPredicate<Integer, List<Employee>> biPredicate2=SearchUtility::isPresent;
		
			
				System.out.println(biPredicate2.test(2, employeeList));
			
		}
		
		
	}
	

