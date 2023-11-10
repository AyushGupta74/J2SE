package com.demo.beans;

import java.time.LocalDate;

public class Vendor extends Employee{
	private int qty;
	private int rate;
	public Vendor() {
		super();
	}
	public Vendor(int pid, String pname, String mob, String email,String dept, String desg, LocalDate doj,int qty, int rate) {
		super(pid,pname,mob,email,dept,desg,doj);
		this.qty = qty;
		this.rate = rate;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public double calculateSal() {
		return qty*rate;
	}
	@Override
	public String toString() {
		return super.toString()+"Vendor [qty=" + qty + ", rate=" + rate + "]";
	}
	
}
