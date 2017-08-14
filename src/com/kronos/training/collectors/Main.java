package com.kronos.training.collectors;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws ParseException {
		List<Person> list = createList();
		
		countAverageSalary(list);
		
	}
	
	static void printCountOnName(List<Person> list){
		Map<String,Long> map = list.stream().collect(Collectors.groupingBy(
				Person::getName,Collectors.counting()
				));
		System.out.println(map);
	}
	
	static void printCountOnNameAndDOB(List<Person> list){
		Map<String,Map<Date,List<Person>>> map = list.stream().collect(Collectors.groupingBy(
				Person::getName,
					Collectors.groupingBy(
							Person::getDob, Collectors.toList())
				));
		
		for(String name:map.keySet()){
			for(Date date:map.get(name).keySet()){
				List<Person> p=map.get(name).get(date);
				System.out.println(p);
			}
			System.out.println();
		}
		//System.out.println(map);
	}
	
	static void countAverageSalary(List<Person> list){
		Map<String, Double> map = list.stream().collect(Collectors.groupingBy(
				Person::getName,Collectors.averagingInt(Person::getSalary)
				));
		
		System.out.println(map);
	}
	
	public static List<Person> createList() throws ParseException{
		String date1 = "12/07/1985";
		String date2 = "21/06/1989";
		String date3 = "12/12/1990";
		String date4 = "21/04/1987";
		Person p1=new Person("Akhilesh", new SimpleDateFormat("dd/MM/yyyy").parse(date1), Boolean.TRUE,1000);
		Person p3=new Person("Akhilesh", new SimpleDateFormat("dd/MM/yyyy").parse(date1), Boolean.TRUE,500);
		Person p2=new Person("Rishabh", new SimpleDateFormat("dd/MM/yyyy").parse(date2), Boolean.TRUE,500);
		Person p4=new Person("Hershu", new SimpleDateFormat("dd/MM/yyyy").parse(date3), Boolean.TRUE,1000);
		Person p5=new Person("Gayatri", new SimpleDateFormat("dd/MM/yyyy").parse(date4), Boolean.FALSE,2000);
		Person p6=new Person("Shuchi", new SimpleDateFormat("dd/MM/yyyy").parse(date4), Boolean.FALSE,3000);
		List<Person> list=new CopyOnWriteArrayList();
		list.add(p6);
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		return list;
	}
}
