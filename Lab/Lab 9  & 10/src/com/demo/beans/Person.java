package com.demo.beans;

public class Person 
{
	private int pid;
	private String pname;
	private String email;
	
	
	public Person() 
	{
		System.out.println("Inside default of Person : ");
	}
	
	
	public Person(int pid, String pname, String email) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.email = email;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", email=" + email + "]";
	}
	
	
}
