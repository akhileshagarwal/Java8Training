/**
 * 
 */
package com.kronos.training.lambda;

/**
 * @author Akhilesh.Agarwal
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IAkhilesh1 ak=(String name) -> {
			return "Hello "+name;
		};
		
		System.out.println(ak.getMessage("akhilesh"));
		
		//Step 2:- datatype removed and braces around the parameters can be removed if its only one
		
		ak=name -> {
			return  "Hello "+name;
		};
		System.out.println(ak.getMessage("Akki"));
		//Step 3:- return statement can be removed in case its a single return statement
			
		ak=name-> "Hello "+name;
		System.out.println(ak.getMessage("Agarwal"));
		printMessage(name-> "Helloooo " + name,"Akhilesh");
		
		
		//For two parameters, Brackets are reqiured as there are two parameters
		IAkhilesh2 ak2=(a,b)-> a+b;
		
		System.out.println(ak2.add(5,6));
		
		}
	
	static void printMessage(IAkhilesh1 ak, String message){
		System.out.println(ak.getMessage(message));
	}
		
		

	}

