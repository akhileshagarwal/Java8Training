package com.kronos.training.methodReference;


class Akhilesh{
	void sayHello(){
		System.out.println("Hi........");
	}
}

interface I1{
	void test();
}
public class MethodReferenceTest1 {
	public static void main(String[] args) {
		
		Akhilesh akki=new Akhilesh();
		I1 i1=()-> akki.sayHello();
		i1.test();
		
		I1 i2=akki::sayHello;
		i2.test();
	}
}
