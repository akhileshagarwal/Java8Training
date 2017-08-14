package com.kronos.training.methodReference;

import java.util.logging.Logger;

import com.kronos.training.lambda.exercise.Employee;

class Akhilesh2{
	String sayHello(String name){
		System.out.println("Hi........"+name);
		return name;
	}
}

interface I2{
	String test(String name1);
}

interface I3{
	void process(String s);
}

class Second{
	static void doSomething(String e){
		Logger log=Logger.getLogger("Employee");
		log.info(e);
	}
}


public class MethodReferenceTest2 {

	public static void main(String[] args) {
		Akhilesh2 ak2=new Akhilesh2();
		I2 i=name->ak2.sayHello(name); //Without method reference and declaring a lambda expression
		i.test("Shcuhita");
		
		I2 i2=ak2::sayHello; //with Method reference
		
		System.out.println(i2.test("Akhilesh"));
		
		I3 i3=System.out::println;
		i3.process("Harshit");
		
		I3 i32=Second::doSomething; //for static methods we need static references i.e. class reference
		i32.process("rishabh");
		

	}

}
