package com.kronos.training.lambda.exercise;

import java.io.File;
import java.io.IOException;

public interface TestExceptionLambda {
	
	public File[] findHiddenFiles() throws IOException;

}
