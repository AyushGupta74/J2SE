package com.demo.test;

import com.demo.beans.MyTasks;
import com.demo.thread.MyTableThread;

public class TestSynchronization {
   public static void main(String[] args) {
	 MyTasks ob=new MyTasks();
	 MyTasks ob1=new MyTasks();
	 MyTableThread th1=new MyTableThread(ob,7);
	 MyTableThread th2=new MyTableThread(ob,3);
	 //MyTableThread th2=new MyTableThread(ob1,3);
	 th1.start();
	 th2.start();
}
}
