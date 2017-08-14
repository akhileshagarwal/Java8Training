package com.kronos.training.builtinfunctional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(25,49,100,81);
		list.stream().map(no->Math.sqrt(no)).forEach(System.out::println);
		System.out.println("using method reference");
		Function<Integer, Double> func=Math::sqrt;
		list.stream().map(func).forEach(System.out::println);

	}

}
