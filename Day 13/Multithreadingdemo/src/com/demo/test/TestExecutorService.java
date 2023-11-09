package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import com.demo.thread.MyCallableTask;

public class TestExecutorService {

	public static void main(String[] args) {
		//step-1 create executor service object
		ExecutorService es=Executors.newFixedThreadPool(4);
		//step 3--submit tasks to executor and store associated future in a list
		List<Future<Integer>> list=new ArrayList<>();
		for(int i=1;i<=91;i=i+10) {
			Future<Integer> f=es.submit(new MyCallableTask(i,i+9));
			list.add(f);
		}
		int total=0;
		for(Future<Integer> f1:list) {
			try {
				int num=f1.get();
				total=total+num;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("addition : "+total);
		try {
			es.awaitTermination(500, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
