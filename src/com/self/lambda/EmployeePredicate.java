package com.self.lambda;

import com.kronos.training.lambda.exercise.Employee;

public interface EmployeePredicate {
	
	public boolean accept(Employee e);

}
