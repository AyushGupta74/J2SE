package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
     private EmployeeDao edao;
     public EmployeeServiceImpl() {
    	 edao=new EmployeeDaoImpl();
     }
	@Override
	public void ReadFromFile() {
		edao.readDataFromFile();
		
	}
	@Override
	public void addNewEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int eid=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter mobile");
		String mob=sc.next();
		Employee e=new Employee(eid,nm,mob);
		edao.save(e);
	}
	@Override
	public List<Employee> getAllEmployees() {
		return edao.findAll();
	}
	@Override
	public boolean deleteById(int eid) {
		return edao.removeById(eid);
	}
	@Override
	public void writToFile() {
		edao.writeDataToFile();
		
	}
}
