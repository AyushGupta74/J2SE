package com.demo.beans;

import java.io.Serializable;

public class Employee implements Serializable {
	private int eid;
	private String ename;
	private String mob;

	public Employee() {
		super();
	}

	public Employee(int eid, String ename, String mob) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.mob = mob;
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

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", mob=" + mob + "]";
	}

	public boolean equals(Object ob) {
		return eid == ((Employee) ob).eid;
	}
}
