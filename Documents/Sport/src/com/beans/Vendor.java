package com.beans;
import java.time.LocalDate;

public class Vendor extends Employee {
	private int numsOfEmployee;
	private double amount;
	public Vendor() {
		super();
	}
	public Vendor(int pid, String pname, String pmobile, String pemail, String dept,
			String designation, LocalDate doj, int numsOfEmployee, double amount) {
		super(pid, pname, pmobile, pemail, dept, designation, doj);
		this.numsOfEmployee = numsOfEmployee;
		this.amount = amount;
	}
	public int getNumsOfEmployee() {
		return numsOfEmployee;
	}
	public void setNumsOfEmployee(int numsOfEmployee) {
		this.numsOfEmployee = numsOfEmployee;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return super.toString() + "Vendors [Number of Employee=" + numsOfEmployee + ", Amount=" + amount + "]";
	}
	
}
