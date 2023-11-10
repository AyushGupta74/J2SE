package com.demo.thread;

import com.demo.beans.MyTasks;

public class MyTableThread extends Thread {
	private MyTasks ob = new MyTasks();
	private int n;
	public void d()
	{
		System.out.println(ob);
	}
	public MyTableThread(int n) {
	
		this.n=n;
	}
	
   public void run() {
	   ob.printTable(n);
   }
}
