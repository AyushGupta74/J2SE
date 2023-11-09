package com.demo.thread;

import com.demo.beans.Storage;

public class Consumer extends Thread{
	
	     private Storage s;
	     private int n;
	     public Consumer(Storage s,int n) {
	    	 this.s=s;
	    	 this.n=n;
	     }
		 public void run() {
			 for(int i=0;i<n;i++) {
					s.get();
					
				}
		 
	}
}
