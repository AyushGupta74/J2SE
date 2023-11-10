package com.demo.beans;

import java.time.LocalDate;

public class Salaried extends Employee{
	private int sal;
	private int bonus;
	public Salaried() {
		super();
	}
	public Salaried(int pid, String pname, String mob, String email,String dept, String desg, LocalDate doj,int sal, int bonus) {
		super(pid,pname,mob,email,dept,desg,doj);
		this.sal = sal;
		this.bonus = bonus;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public double calculateSal() {
		return sal+0.10*sal+0.15*sal-0.08*sal+bonus;
	}
	
	public double calculateBonus() {
		return sal *0.10+bonus;
	}
	@Override
	public String toString() {
		return super.toString()+"Salaried [sal=" + sal + ", bonus=" + bonus + "]";
	}
	
	
}
