package com.demo.service;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Contract;
import com.demo.beans.Employee;
import com.demo.beans.Salaried;
import com.demo.beans.Vendor;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao edao;
	public EmployeeServiceImpl() {
		edao = new EmployeeDaoImpl();
	}

	@Override
	public void addEmployee(int pick) {
		Scanner sc = new Scanner(System.in);
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
		Employee e = null;
		switch(pick) {
		case 1:
			System.out.println("enter salary");
			int s=sc.nextInt();
			System.out.println("enter bonus");
			int b=sc.nextInt();
			e=new Salaried(pid, nm, mob, em, dept, desg, ldt, s, b);
			edao.save(e);
			break;
		case 2:
			System.out.println("enter hrs");
			int h=sc.nextInt();
			System.out.println("enter charges");
			int c=sc.nextInt();
			e=new Contract(pid, nm, mob, em, dept, desg, ldt, h, c);
			edao.save(e);
			break;
		case 3:
			System.out.println("enter quantity");
			int q=sc.nextInt();
			System.out.println("enter rate");
			int r=sc.nextInt();
			e=new Vendor(pid, nm, mob, em, dept, desg, ldt, q, r);
			edao.save(e);
			break;
		}
	}

	@Override
	public List<Employee> DisplayAll() {
		return edao.FindAll();
	}

	@Override
	public Employee DisplayByID(int pick) {
		return edao.FindByID(pick);
	}

	@Override
	public void FindTypeofEmp(int pick) {
		edao.FindType(pick);		
	}

	@Override
	public boolean UpdateSalbyID(int pick, int amt) {
		return edao.ModifySal(pick, amt);
	}

	@Override
	public boolean DeleteById(int pick) {
		return edao.removeById(pick);
	}
	@Override
	public List<Employee> Sortbysal() {
		return edao.sortsalary();
	}

	@Override
	public List<Employee> SortbyName() {
		return edao.sortbyname();
	}

}
