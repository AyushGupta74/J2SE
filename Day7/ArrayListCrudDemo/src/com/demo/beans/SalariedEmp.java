package com.demo.beans;
import java.time.LocalDate;

public class SalariedEmp extends Employee{
	private double sal;
	private double bonus;
	public SalariedEmp() {
		super();
	}
	public SalariedEmp(int id) {
		super(id);
		
	}
	public SalariedEmp(int pid, String pname, String mobile, String email,String dept, String desg, LocalDate doj,double sal, double bonus) {
		super(pid,pname,mobile,email,dept,desg,doj);
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
		return super.toString()+"SalariedEmp [sal=" + sal + ", bonus=" + bonus + "]";
	}
	
	public double calculateSal() {
		return sal+0.10*sal+0.15*sal-0.08*sal+bonus;
	}
	
	public double calculateBonus() {
		return sal *0.10+bonus;
		
	}
	

}
