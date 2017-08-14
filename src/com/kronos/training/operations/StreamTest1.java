package com.kronos.training.operations;

import java.util.Arrays;
import java.util.List;

public class StreamTest1 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		list.stream().map(n->n*n).peek(System.out::println).map(n->n+1).forEach(System.out::println);

	}

}
