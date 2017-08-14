package com.self.lambda;

import com.kronos.training.lambda.exercise.Employee;

public class LeadEmployee implements EmployeePredicate {

	@Override
	public boolean accept(Employee e) {
		// TODO Auto-generated method stub
		return e.getDesignation().equals("Lead");
	}

}
