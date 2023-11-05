package com.beans;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
	private double sal;
	private double bonus;
	public SalariedEmployee() {
		super();
	}
	public SalariedEmployee(int id) {
		super(id);
	}
	public SalariedEmployee(int pid, String pname, String pmobile, String pemail, String dept, String designation, LocalDate doj, double sal, double bonus) {
		super(pid, pname, pmobile, pemail, dept, designation, doj);
		this.sal = sal;
		this.bonus = bonus;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return super.toString() + "SalariedEmployee [Sal=" + sal + ", Bonus=" + bonus + "]";
	}
	public double CalculateSal() {
		return sal+bonus;
	}
}
