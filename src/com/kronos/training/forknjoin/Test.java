package com.kronos.training.forknjoin;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

public class Test {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Total no of cpus available: "+Runtime.getRuntime().availableProcessors());
		ForkJoinPool forkJoinPool=new ForkJoinPool();
		int[] array=new int[1000];
		for(int i=0;i<array.length;i++){
			array[i]=(int)(Math.random()*5000);
		}
		FindMaxTask findMaxTask=new FindMaxTask(array);
		forkJoinPool.invoke(findMaxTask);
		try {
			int maxValue=findMaxTask.get();
			System.out.println("Max value in the array: "+maxValue);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
