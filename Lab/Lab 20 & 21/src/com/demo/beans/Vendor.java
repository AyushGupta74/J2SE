package com.demo.beans;

import java.time.LocalDate;

public class Vendor extends Employee{
	private double rate;
	private int qty;
	public Vendor() {
		super();
	}
	public Vendor(int pid, String pname, String mobile, String email, String dept, String desg, LocalDate doj,double rate, int qty) {
		super(pid, pname, mobile, email,dept,desg,doj);
		this.rate = rate;
		this.qty = qty;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double calculateSal() {
		return rate*qty;
	}
	@Override
	public String toString() {
		return super.toString()+"Vendor [rate=" + rate + ", qty=" + qty + "]";
	}
	
}
