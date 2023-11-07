package com.demo.thread;

import com.demo.beans.MyTasks;

public class MyTableThread extends Thread {
	private MyTasks ob;
	private int n;
	public MyTableThread(MyTasks o,int n) {
		ob=o;
		this.n=n;
	}
   public void run() {
	   ob.printTable(n);
   }
}
