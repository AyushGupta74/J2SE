package com.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.beans.ContractEmployee;
import com.beans.Employee;
import com.beans.SalariedEmployee;
import com.beans.Vendors;
import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao edao;
	public EmployeeServiceImpl(){
		edao = new EmployeeDaoImpl();
	}
	@Override
	public void addNewEmployee(int ch) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID:");
		int pid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name:");
		String nm=sc.nextLine();
		System.out.println("Enter mobile:");
		String mob=sc.next();
		System.out.println("Enter email:");
		String em=sc.next();
		System.out.println("Enter department:");
		String dept=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter designation:");
		String desg=sc.nextLine();
		System.out.println("Enter date of joining(dd,MM,yyyy):");
		String dt=sc.next();
		LocalDate ld = LocalDate.parse(dt, DateTimeFormatter.ofPattern("dd,MM,yyyy"));
		Employee e = null;
		if (ch==1) {
			System.out.println("Enter salary:");
			double sal=sc.nextDouble();
			System.out.println("Enter bonus:");
			double bonus=sc.nextDouble();
			e=new SalariedEmployee(pid, nm, mob, em, dept, desg, ld, sal, bonus);
		}
		if (ch==2) {
			System.out.println("Enter hours:");
			int hrs=sc.nextInt();
			System.out.println("Enter charges per hour:");
			double charges=sc.nextDouble();
			e=new ContractEmployee(pid, nm, mob, em, dept, desg, ld, charges, hrs);
		}
		if (ch==3) {
			System.out.println("Enter numberOfEmployee:");
			int number=sc.nextInt();
			System.out.println("Enter amount:");
			double amount=sc.nextDouble();
			e=new Vendors(pid, nm, mob, em, dept, desg, ld, amount, number);
		}
		edao.save(e);
	}
	@Override
	public List<Employee> displayAllEmployee() {
		return edao.getAll();
	}
	@Override
	public Employee displayByID(int id) {
		return edao.getByID(id);
	}
	@Override
	public Employee displayByID2(int id) {
		return edao.getByID2(id);
	}
	@Override
	public boolean deleteByID(int id) {
		return edao.removeByID(id);
	}
	@Override
	public Employee modifySal(int id, double sal) {
		return edao.updateSal(id,sal);
	}
	@Override
	public List<Employee> sortBySalary() {
		return edao.sortBySal();
	}
	@Override
	public List<Employee> sortByName() {
		return edao.sortByName();
	}
	@Override
	public List<Employee> sortByDesg() {
		return edao.sortByDesg();
	}
	@Override
	public Employee[] nTopmostSalary(int num) {
		return edao.nTopmostSalary(num);
	}
}
