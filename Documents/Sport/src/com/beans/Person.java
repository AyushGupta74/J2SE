package com.beans;

public class Person {
	private int pid;
	private String pname;
	private String pmobile;
	private String pemail;
	public Person() {
		super();
	}
	//where and why is it used?
	public Person(int id) {
		this.pid=id;
	}
	//why it is used?
	public boolean equals(Object ob) {
		return this.pid==((Person)ob).pid;
	}
	public Person(int pid, String pname, String pmobile, String pemail) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pmobile = pmobile;
		this.pemail = pemail;
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
	public String getPmobile() {
		return pmobile;
	}
	public void setPmobile(String pmobile) {
		this.pmobile = pmobile;
	}
	public String getPemail() {
		return pemail;
	}
	public void setPemail(String pemail) {
		this.pemail = pemail;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", pmobile=" + pmobile + ", pemail=" + pemail + "]";
	}
}