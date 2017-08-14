package com.kronos.training.collectors;

import java.util.Date;

public class Person {
	private final String name;
	private Date dob;
	private boolean isMale;
	private int salary;
	
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Person(String name, Date dob, boolean isMale, int salary) {
		super();
		this.name = name;
		this.dob = dob;
		this.isMale = isMale;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}
	/*public void setName(String name) {
		this.name = name;
	}*/
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", dob=" + dob + ", isMale=" + isMale + ", salary=" + salary + "]";
	}
}
