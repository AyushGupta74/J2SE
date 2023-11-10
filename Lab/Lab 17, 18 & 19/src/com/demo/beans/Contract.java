package com.demo.beans;

import java.time.LocalDate;

public class Contract extends Employee{
	private int hrs;
	private int charges;
	
	public Contract() {
		super();
	}
	public Contract(int pid, String pname, String mob, String email,String dept, String desg, LocalDate doj,int hrs, int charges) {
		super(pid,pname,mob,email,dept,desg,doj);
		this.hrs = hrs;
		this.charges = charges;
	}
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public int getCharges() {
		return charges;
	}
	public void setCharges(int charges) {
		this.charges = charges;
	}
	public double calculateSal() {
		return hrs*charges;
	}
	@Override
	public String toString() {
		return super.toString()+"Contract [hrs=" + hrs + ", charges=" + charges + "]";
	}
	
	
}
