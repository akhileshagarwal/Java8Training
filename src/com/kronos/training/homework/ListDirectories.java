package com.kronos.training.homework;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;



public class ListDirectories {

	public static void main(String[] args) {
		File file=new File("C:\\KRONOS");
		File[] files=file.listFiles();
		List<File> fileList= Arrays.asList(files);
		Predicate<File> filter=File::isDirectory;
		fileList.stream().filter(filter).forEach(System.out::println);

	}

}
