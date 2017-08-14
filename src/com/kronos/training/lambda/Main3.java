package com.kronos.training.lambda;

import java.util.logging.Logger;

public class Main3 {

	public static void main(String[] args) {
		//lambda for void method
		IAkhilesh3 ak3=name->System.out.println("returns Nothing "+name);
		ak3.returnNothing("Akhilesh");
		
		ak3=name->{
			Logger log=Logger.getLogger(Main3.class.getName());
			log.info("test "+name);
		};
		
		ak3.returnNothing("Akhilesh");
	}

}
