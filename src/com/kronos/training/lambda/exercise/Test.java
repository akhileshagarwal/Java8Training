package com.kronos.training.lambda.exercise;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		Comparator<Employee> comparator=(s1,s2)->s2.getSalary().compareTo(s1.getSalary());
		Comparator<Integer> comparatorMethod=Integer::compareTo;
		Set<Employee> setUsingLanbda=new TreeSet<Employee>(comparator);
		Employee e1=new Employee(1,"Akhilesh","SSE",200);
		Employee e2=new Employee(2,"Arun","SSE",2000);
		Employee e3=new Employee(3,"Ajit","SSE",400);
		
		setUsingLanbda.add(e1);
		setUsingLanbda.add(e2);
		setUsingLanbda.add(e3);
		
		System.out.println(setUsingLanbda);

	}

}
