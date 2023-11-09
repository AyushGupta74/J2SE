package com.demo.thread;

import com.demo.beans.MyTasks;

//if any class is already extending another class then use Runnable interface instead of 
//Thread class
public class MyPrimeThread implements Runnable{
	private MyTasks ob;
	private int n;
	
	public MyPrimeThread(MyTasks ob,int n) {
	  this.ob=ob;
	  this.n=n;
	}
	
	@Override
	public void run() {
		ob.checkPrime(7);
		
	}

}
