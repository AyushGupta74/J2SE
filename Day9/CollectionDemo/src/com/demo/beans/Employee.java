package com.demo.beans;

public class Employee implements Comparable<Employee>{
	private int eid;
	private String ename;
	private String dept;
	private double sal;
	public Employee() {
		super();
	}
	public Employee(int eid, String ename, String dept, double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dept = dept;
		this.sal = sal;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDept() {
		return dept;
	}
	public int hashCode() {
		System.out.println("in hashcode method");
		return eid;
	}
	public boolean equals(Object obj) {
		System.out.println("in equals method");
		return this.eid==((Employee)obj).eid;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", dept=" + dept + ", sal=" + sal + "]";
	}
	@Override
	public int compareTo(Employee o) {
		System.out.println("in compareto method");
		return this.eid-o.eid;
	}
	

}
