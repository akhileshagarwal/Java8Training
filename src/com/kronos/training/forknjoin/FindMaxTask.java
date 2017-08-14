package com.kronos.training.forknjoin;

import java.util.concurrent.RecursiveTask;

public class FindMaxTask extends RecursiveTask<Integer>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1147507864664083629L;
	private int[] array;
	private int start,end;
	
	

	public FindMaxTask(int[] array, int start, int end) {
		super();
		this.array = array;
		this.start = start;
		this.end = end;
	}



	public FindMaxTask(int[] array) {
		super();
		this.array = array;
		start=0;
		end=array.length;
	}



	@Override
	protected Integer compute() {
		System.out.println(Thread.currentThread().getName()+" is processing values between "+
				start+" and "+end);
		if(end-start<20){
			int max=array[start];
			for(int i=start+1;i<end;i++){
				if(array[i]>max){
					max=array[i];
				}
			}
			return max;
		}
		else{
			int mid=(end-start)/2+start;
			FindMaxTask left=new FindMaxTask(array,start,mid);
			FindMaxTask right=new FindMaxTask(array,mid+1,end);
			left.fork();
			return Math.max(right.compute(), left.join());
		}
		
	}

}
