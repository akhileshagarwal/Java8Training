package com.kronos.training.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

	public static void main(String[] args) {
		List<Integer> numbers1=Arrays.asList(1,2,3);
		List<Integer> numbers2=Arrays.asList(4,5);
		List<int[]> pairs = numbers1.stream().flatMap(i-> numbers2.stream().map(j->new int[]{i,j})
				).collect(Collectors.toList());
		
		List<int[]> pairs1 = numbers1.stream().flatMap(i-> numbers2.stream().filter(j->((i+j)%2==0)).map(j->new int[]{i,j})
				).collect(Collectors.toList());
	System.out.println(pairs1);
	
	String[] arrayOfWords = {"Goodbye", "World"};
	List<String> words=Arrays.asList(arrayOfWords);
	List<String> distinctAlphabets = words.stream().map(w->w.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
	System.out.println(distinctAlphabets);
	}

}
