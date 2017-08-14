package com.kronos.training.builtinfunctional;

import java.util.List;
import java.util.function.Predicate;

import com.kronos.training.lambda.exercise.Employee;

public class SearchUtility {
	public static boolean isPresent(int id, List<Employee> employee) {
		
		
		for (Employee e : employee) {
			if (e.getId() == id)
				return true;

		}
		return false;
	}
}
