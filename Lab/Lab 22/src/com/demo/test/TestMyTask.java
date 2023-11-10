package com.demo.test;

import com.demo.beans.MyTasks;
import com.demo.thread.MyFactorial;
import com.demo.thread.MyPrimeThread;
import com.demo.thread.MyTableThread;

public class TestMyTask {
   public static void main(String[] args) {
		  MyTasks ob=new MyTasks();
	
	  MyPrimeThread p=new MyPrimeThread(ob,7);
	  Thread th1=new Thread(p);
	  th1.start();

	  MyTableThread th=new MyTableThread(7);
	  
	  MyTableThread th2=new MyTableThread(3);
	  MyFactorial f1=new MyFactorial(ob, 5);
	  th2.setPriority(Thread.MIN_PRIORITY+3);
	  System.out.println(th2.getState());
	  th2.start();
	  System.out.println(th2.getState());
	  th.start();
	  f1.start();
	  System.out.println("Main will resume from here");
	  try {
		th2.join();
		th.join();
		f1.join();
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	  
	  System.out.println("main ends here");
	  
}
}
