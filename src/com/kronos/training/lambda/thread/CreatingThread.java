package com.kronos.training.lambda.thread;

public class CreatingThread {
//using lambda
	public static void main(String[] args) {
		Thread thread=new Thread(()->{
			for(int i=0;i<6;i++){
				try {
					Thread.sleep(3000);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				System.out.println(i);}
		});
		
		thread.start();

	}

}
