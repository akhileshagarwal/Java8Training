package com.kronos.training.lambda.exercise;

import java.io.File;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args){
		String name;
		TestExceptionLambda test=()->{
			//name="Akhilesh";
			File[] hiddenFiles = new File(".").listFiles(File::isHidden);
			if(hiddenFiles.length==0){
				System.out.println("None");
				throw new IOException();
			}
			return hiddenFiles;
		};
		
		try {
			test.findHiddenFiles();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Done");
	}
}
