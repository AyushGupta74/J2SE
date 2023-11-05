package com.beans;

public class Members extends Person{
	private String membership;
	private int amount;
	public Members() {
		super();
	}
	public Members(int pid, String pname, String pmobile, String pemail,String membership, int amount) {
		super(pid, pname, pmobile, pemail);
		this.membership = membership;
		this.amount = amount;
	}
	public String getMembership() {
		return membership;
	}
	public void setMembership(String membership) {
		this.membership = membership;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return super.toString() + "Members [membership=" + membership + ", amount=" + amount + ", toString()=]";
	}
}