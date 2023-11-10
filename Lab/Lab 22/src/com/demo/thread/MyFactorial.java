package com.demo.thread;

import com.demo.beans.MyTasks;

public class MyFactorial extends Thread {
	private MyTasks ob;
	private int n;
	
	public MyFactorial(MyTasks ob, int n) {
		super();
		this.ob = ob;
		this.n = n;
	}


	public void run() {
		System.out.println("Factorial: "+ob.factorial(5));
	}

}
