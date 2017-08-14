package com.kronos.training.streams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBuilder {

	public static void main(String[] args) {
		Stream.of(10, 44, 78, 99).map(e -> Math.sqrt(e)).sorted().forEach(System.out::println);
		OptionalDouble doubleNum = Arrays.stream(new int[] { 20, 33, 65, 34, 12 }).average();
		System.out.println(doubleNum.getAsDouble());
		//Arrays.stream(new int[] { 20, 33, 65, 34, 12 }).collect(Collectors.toList());
		
		List<Double> list=Stream.of(10, 44, 78, 99).map(e -> Math.sqrt(e)).filter(e->e>1).collect(Collectors.toList());
		for(Double d:list){
			System.out.println(d);
		}
	}

}
