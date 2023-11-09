package com.demo.thread;

import java.util.concurrent.Callable;
//step 2
public class MyCallableTask implements Callable<Integer>{
     private int start;
     private int stop;
     
	public MyCallableTask(int start, int stop) {
		super();
		this.start = start;
		this.stop = stop;
	}

	@Override
	public Integer call() throws Exception {
		int s=0;
		for(int i=start;i<=stop;i++) {
			s=s+i;
		}
		System.out.println(start+"--"+stop+" threadid ---"+Thread.currentThread().getId()+" Thread name: "+Thread.currentThread().getName());
		return s;
	}
	

}
