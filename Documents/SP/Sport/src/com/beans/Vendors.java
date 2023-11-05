package com.beans;
import java.time.LocalDate;

public class Vendors extends Employee {
	private double amount;
	private int numsOfEmployee;
	public Vendors() {
		super();
	}
	public Vendors(int id) {
		super(id);
	}
	public Vendors(int pid, String pname, String pmobile, String pemail, String dept,
			String designation, LocalDate doj, double amount, int numsOfEmployee) {
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
		return super.toString() + "Vendors [+ Amount=" + amount + "Number of Employee=" + numsOfEmployee + "]";
	}
	public double CalculateSal() {
		return amount*numsOfEmployee;
	}
}
