package com.kronos.training.builtinfunctional;

import java.util.function.UnaryOperator;

import com.kronos.training.lambda.exercise.Employee;

public class UnaryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnaryOperator<String> op1 = String::toUpperCase;
		UnaryOperator<Double> sqrt = Math::sqrt;
		UnaryOperator<Integer> rev = Integer::reverse;

		System.out.println(op1.apply("hello"));
		System.out.println(sqrt.apply(25.0));
		System.out.println(rev.apply(345));
		UnaryOperator<Employee> incSalary = UnaryTest::incrementSalary;
		System.out.println(incSalary.apply(new Employee(1, "Rajiv", "Developer", 40000)));

	}

	static Employee incrementSalary(Employee e) {
		e.setSalary(e.getSalary() + 5000);
		return e;
	}

}
