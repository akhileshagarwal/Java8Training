package com.kronos.training.builtinfunctional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import com.kronos.training.lambda.exercise.Employee;
import com.kronos.training.methodReference.EmployeeUtility;

public class FunctionTest {

	public static void main(String[] args) {
		EmployeeUtility utility=new EmployeeUtility();
		Function<Integer, Employee> f=utility::getEmployee;
		List<Integer> list=Arrays.asList(1,2,3);
		list.forEach(e->{
			System.out.println(f.apply(e));
		}); //not good
		
		list.stream().map(utility::getEmployee).forEach(System.out::println); //perfect

	}

}
