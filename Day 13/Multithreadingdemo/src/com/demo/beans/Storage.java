package com.demo.beans;

public class Storage {
	private int num;
	private boolean valueCheck;
	public Storage() {
		valueCheck=false;
	}
	
	public synchronized void put(int n) {
		if(valueCheck) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.num=n;
		System.out.println("Put : "+num);
		valueCheck=true;
		notify();
	}
	public  synchronized void get() {
		if(!valueCheck) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Got : "+num);
		valueCheck=false;
		notify();
	}

}
