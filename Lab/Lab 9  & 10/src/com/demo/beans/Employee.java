package com.demo.beans;

public class Employee extends Person 
{
	private String dept;
	private String desg;
	
	
	
	public Employee() {
		super();
	}

	public Employee(String dept, String desg,int pid, String pname, String email) {
		super(pid,pname,email);
		this.dept = dept;
		this.desg = desg;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	@Override
	public String toString() {
		return super.toString()+"Employee [dept=" + dept + ", desg=" + desg + "]";
	}
	
	
	
}
