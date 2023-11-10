package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.beans.SalariedEmployee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService 
{
	EmployeeDao ed = new EmployeeDaoImpl();
	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public void addNewObject() 
	{
		System.out.println("Enter id :");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name :");
		String name=sc.next();
		System.out.println("Enter email :");
		String email=sc.next();
		System.out.println("Enter dept :");
		String dept=sc.next();
		System.out.println("Enter desg :");
		String desg=sc.next();
		System.out.println("Enter sal :");
		double sal=sc.nextDouble();
		System.out.println("Enter bonus :");
		double b=sc.nextDouble();
	
		Employee e = new SalariedEmployee(sal,b,dept,desg,id,name,email);
		ed.addNew(e);
	}


	@Override
	public Employee[] displayObjects() 
	{
		return ed.findAllObjects();
	}

}
