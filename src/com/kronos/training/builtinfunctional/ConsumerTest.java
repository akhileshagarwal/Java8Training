package com.kronos.training.builtinfunctional;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Akhilesh");
		list.add("Shuchita");
		list.add("Arun");
		Consumer<String> consumer=s->System.out.println(s);
		list.forEach(consumer);
		
		System.out.println("Using Mehtod Reference");
		list.forEach(System.out::println);
		list.forEach(s->System.out.println(s));

	}

}
