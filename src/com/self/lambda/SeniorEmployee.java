package com.self.lambda;

import com.kronos.training.lambda.exercise.Employee;

public class SeniorEmployee implements EmployeePredicate{

	@Override
	public boolean accept(Employee e) {
		// TODO Auto-generated method stub
		return e.getSalary()>500;
	}

}
