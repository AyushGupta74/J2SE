package com.beans;

import java.time.LocalDate;

public class ContractEmployee extends Employee {
	private double charge;
	private int hrs;
	public ContractEmployee() {
		super();
	}
	public ContractEmployee(int id) {
		super(id);
	}
	public ContractEmployee(int pid, String pname, String pmobile, String pemail, String dept,
			String designation, LocalDate doj, double charge, int hrs) {
		super(pid, pname, pmobile, pemail, dept, designation, doj);
		this.charge = charge;
		this.hrs = hrs;
	}
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public double getCharge() {
		return charge;
	}
	public void setCharge(double sal) {
		this.charge = sal;
	}
	@Override
	public String toString() {
		return super.toString() + "ContractEmployee [charge=" + charge + "hrs=" + hrs + " ]";
	}
	public double CalculateSal() {
		return hrs*charge;
	}
}
