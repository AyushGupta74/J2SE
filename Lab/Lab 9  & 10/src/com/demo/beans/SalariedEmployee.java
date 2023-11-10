package com.demo.beans;

public class SalariedEmployee extends Employee
{
	private double sal;
	private double bonus;
	
	
	public SalariedEmployee() {
		super();
	}
	
	
	public SalariedEmployee(double sal, double bonus,String dept, String desg,int pid, String pname, String email) {
		super(dept,desg,pid,pname,email);
		this.sal = sal;
		this.bonus = bonus;
	}
	
	
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+"SalariedEmployee [sal=" + sal + ", bonus=" + bonus + "]";
	}
	
	
}
