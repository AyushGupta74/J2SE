package com.demo.beans;

import com.demo.enums.Gender;

public class Person {
	private int pid;
	private String pname;
	private Gender g;
	public Person() {
		super();
	}
	public Person(int pid, String pname, Gender g) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.g = g;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Gender getG() {
		return g;
	}
	public void setG(Gender g) {
		this.g = g;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", g=" + g + "]";
	}
	

}
