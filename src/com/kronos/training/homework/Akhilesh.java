package com.kronos.training.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Akhilesh {
public static void main(String[] args) {
	List<Object> list = new ArrayList<>();
	list.add(new Integer(1));
	list.add("TRUE - 1000 - fConfigScrubbing EXECUTION SUCCESS. - 1000 - FPIISCRUBING EXECUTION SUCCESSFUL");
	Optional<String> executionStatus = 
			list.stream()
									 .filter(obj -> (obj instanceof String))
									 .map(obj -> obj.toString().split("-")[0])
									 .filter(str -> str.trim().equalsIgnoreCase("true"))
									 .findFirst();
System.out.println(executionStatus.get());
}
}
