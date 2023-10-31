package com.demo.beans;

public class Person {
	//data members
	private int pid;
	private String pname;
	private String mobile;
	
	//default constructor
	//one parameter implicitly and it is this
	public Person() {
		pid=0;
		pname=null;
		mobile=null;
	}
	//parametrized constructor
	//one parameter implicitly and it is this, 
	//and plus 3 more parameters will be there
	public Person(int pid,String pname,String mob) {
		this.pid=pid;
		this.pname=pname;
		this.mobile=mob;
		
	}
	
	///setter function
	public void setPid(int pid) {
		this.pid=pid;
	}
	public void setPname(String nm) {
		this.pname=nm;
	}
	public void setMobile(String m) {
		this.mobile=m;
	}
	public int getPid() {
		return this.pid;
	}
	public String getPname() {
		return pname;
	}
	public String getMobile() {
		return mobile;
	}
	/*
	 * //member method public void displayPerson(){
	 * System.out.println("pid: "+this.pid);
	 * System.out.println("name: "+this.pname);
	 * System.out.println("mobile: "+mobile); }
	 */
	
	public String toString() {
		return "pid: "+this.pid+"\nName: "+this.pname+"\nMobile: "+this.mobile;
	}

}
