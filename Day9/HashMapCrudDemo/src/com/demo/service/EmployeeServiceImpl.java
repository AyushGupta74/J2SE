package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.demo.beans.ContractEmployee;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao edao;
	public EmployeeServiceImpl() {
		edao=new EmployeeDaoImpl();
	}
	
	@Override
	public void addnewEmployee(int ch) {
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
			e=new ContractEmployee(pid, nm, mob, em, dept, desg, ldt, hrs, charges);
		}
		else {
			//vendor details
		}
		edao.save(e);
		
	}

	@Override
	public List<Employee> displayAll() {
		return edao.getAll();
	}

	@Override
	public Employee displayById(int id) {
		return edao.getById(id);
	}

	@Override
	public boolean deleteById(int id) {
		return edao.removeById(id);
	}

	@Override
	public boolean modifySalById(int id, double sal) {
		return edao.updateSalById(id,sal);
	}

	

	@Override
	public List<Employee> sortBySalary() {
		return edao.sortBySal();
	}

	@Override
	public Employee[] getTopNEmployees(int n) {
		return edao.findTopNEmployeesBySal(n);
	}

	@Override
	public List<Employee> getBySalary(double sal) {
		return edao.findBySalary(sal);
	}

	@Override
	public TreeMap<Integer, Employee> sortById() {
		return edao.sortById();
	}

}
