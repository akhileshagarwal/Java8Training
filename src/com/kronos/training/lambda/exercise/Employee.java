package com.kronos.training.lambda.exercise;

import java.util.Comparator;

public class Employee implements Comparator<Integer>{
	
	private int id;
	private String name;
	private String designation;
	private Integer salary;
	
	public Employee(Integer id, String name,String designation, Integer i) {
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.salary=i;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+salary.toString()+" "+designation;
	}

	

}
