package com.kronos.training.treeset;

import java.util.Comparator;
import java.util.Set;

import java.util.TreeSet;

public class TreesetTest {

	public static void main(String[] args) {
		Set<String> set=new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
			
		});
		set.add("Akhilesh");
		set.add("Shuchita");
		set.add("Rishabh");
		set.add("Harshit");
		System.out.println(set);
		
		
		//Using Lambda
		Comparator<String> comparator=(s1,s2)->s2.compareTo(s1);
		Set<String> setUsingLanbda=new TreeSet<String>(comparator);
		setUsingLanbda.add("Akhilesh");
		setUsingLanbda.add("Shuchita");
		setUsingLanbda.add("Rishabh");
		setUsingLanbda.add("Harshit");
		System.out.println(setUsingLanbda);

	}

}
