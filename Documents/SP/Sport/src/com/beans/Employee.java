package com.beans;

import java.time.LocalDate;

public class Employee extends Person{
	private String dept;
	private String designation;
	private LocalDate doj;
	public Employee() {
		super();
	}
	public Employee(int id) {
		super(id);
	}
	public Employee(int pid, String pname, String pmobile, String pemail, String dept, String designation, LocalDate doj) {
		super(pid, pname, pmobile, pemail);
		this.dept = dept;
		this.designation = designation;
		this.doj = doj;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return super.toString() + "Employee [dept=" + dept + ", designation=" + designation + ", doj=" + doj + "]";
	}
	public double CalculateSal() {
		return 0;
	}
	
}