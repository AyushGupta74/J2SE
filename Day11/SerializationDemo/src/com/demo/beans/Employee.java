package com.demo.beans;

import java.io.Serializable;

public class Employee implements Serializable{
	private int eid;
	private String ename; 
	private String mobile;
	public Employee() {
		super();
	}
	
	public Employee(int eid, String ename, String mobile) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.mobile = mobile;
	}
	public boolean equals(Object ob) {
		return eid==((Employee)ob).eid;
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
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", mobile=" + mobile + "]";
	}
	

}
