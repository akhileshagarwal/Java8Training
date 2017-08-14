package com.kronos.training.builtinfunctional;

import java.util.Arrays;
import java.util.List;

public class StreamTest {

	public static void main(String[] args) {
		Integer[] array=new Integer[100];
		for(int i=0;i<100;i++){
			array[i]=(int) (Math.random()*500);
			
		}
		
		List<Integer> list=Arrays.asList(array);
		list.stream().parallel().
		forEach(no->{
			System.out.println(Thread.currentThread().getName()+" "+no);
		});

	}

}
