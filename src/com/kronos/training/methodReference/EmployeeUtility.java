package com.kronos.training.methodReference;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;

import com.kronos.training.lambda.exercise.Employee;

public class EmployeeUtility {
	private Map<Integer,Employee> map=new HashMap<>();
	
	public EmployeeUtility() {
		map.put(1, new Employee(1,"Akhilesh","SSE",700));
		map.put(2,new Employee(2,"Arun","SSE",300));
		map.put(3,new Employee(3,"Ajit","SE",200));
		map.put(4,new Employee(4,"Shuchita","Lead",900));
	}
	
	public Employee getEmployee(int id){
		return map.get(id);
	}
	
	public Optional<Employee> findEmployee(int id){
		Employee e=map.get(id);
		return e==null?Optional.empty():Optional.of(e);
	}
	
	/**
	 * Alternate of DoubleFucntion
	 * @param salary
	 * @return
	 */
	public List<Employee> findBySalary(double salary){
		Predicate<Employee> predicate=e->e.getSalary() >= salary;
		List<Employee> list=new ArrayList<>();
		for(Employee e:map.values()){
			if(predicate.test(e)){
				list.add(e);
			}
		}
		return list;
	}
	
	public Collection<Employee> getAllEmployee(){
		return map.values();
	}

}
