package com.kronos.training.methodrefernce.exercise;

interface C{
	int manipulate(String s1, String s2);
}

interface D{
	int length(String c);
}

public class MethodReferenceTest {

	public static void main(String[] args) {
		String a="AKHILESH";
		String b="L";
		C c1=(s1,s2)-> s1.indexOf(s2); //with Lambda
		System.out.println(c1.manipulate(a, b));
		c1=String::indexOf; //with method reference
		System.out.println(c1.manipulate(a, b));
		
		C c2=(s1,s2)-> s1.lastIndexOf(s2);
		System.out.println(c2.manipulate(a, b));
		c2=String::lastIndexOf;
		System.out.println(c2.manipulate(a, b));
		
		C c3=(s1,s2)-> s1.compareTo(s2);
		System.out.println(c3.manipulate(a, b));
		c3=String::compareTo; //Important
		System.out.println(c3.manipulate(a, b));
		
		
		D d1=s1->s1.length();
		System.out.println(d1.length(a));
		d1=String::length;
		System.out.println(d1.length(b));

	}

}
