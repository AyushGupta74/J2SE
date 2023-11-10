package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;
import com.demo.dao.PersonDao;
import com.demo.dao.PesonDaoImpl;

public class PersonServiceImpl implements PersonService {
	PersonDao pdao = new PesonDaoImpl();

	@Override
	public void AddEmployee(int ch) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter pid");
		int pid=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter mobile");
		String mob=sc.next();
		System.out.println("enter email");
		String em=sc.next();
		System.out.println("enter dept");
		String dept=sc.next();
		System.out.println("enter desg");
		String desg=sc.next();
		System.out.println("enter date of joining(dd/MM/yyyy)");
		String dt=sc.next();
		LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Employee e=null;
		if(ch==1) {
			System.out.println("enter salary");
			double s=sc.nextDouble();
			System.out.println("enter bonus");
			double b=sc.nextDouble();
			e=new SalariedEmp(pid, nm, mob, em, dept, desg, ldt, s, b);
		}
		else if (ch==2) {
			System.out.println("enter Hrs");
			int hrs=sc.nextInt();
			System.out.println("enter charges per hour");
			double charges=sc.nextDouble();
			e=new ContractEmp(pid, nm, mob, em, dept, desg, ldt, hrs, charges);
		}
		else {
			System.out.println("enter rate");
			double rate = sc.nextDouble();
			System.out.println("enter quantity");
			int qty = sc.nextInt();
			e=new ContractEmp(pid, nm, mob, em, dept, desg, ldt, qty, rate);
		}
		pdao.save(e);
	}

	@Override
	public Set<Employee> DisplayAll() {
		return pdao.findAll();
	}

	@Override
	public Employee DisplayByid(int pick) {
		return pdao.findbyid(pick);
	}

	@Override
	public boolean Deletebyid(int pick) {
		return pdao.removebyid(pick);
	}

	public void FindType(int id) {
		pdao.type(id);
	}

	@Override
	public boolean ModifySalbyid(int pick, double amt) {
		return pdao.changesalbyid(pick,amt);
	}

	@Override
	public Set<Employee> Sortbysal() {
		return pdao.sortsalary();
	}

	@Override
	public Set<Employee> SortbyName() {
		return pdao.sortbyname();
	}

	@Override
	public Employee[] TopmostbySal(int pick) {
		return pdao.getnEmployee(pick);
	}
	
}
