package com.demo.services;

import java.util.ArrayList;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmpDao;
import com.demo.dao.EmpDaoImpl;

public class EmpServicesImpl implements EmpServices {
	private EmpDao edao;

	public EmpServicesImpl() {
		edao = new EmpDaoImpl();
	}

	@Override
	public void ReadFile() {
		edao.ReadFile();
	}

	@Override
	public void WriteFile() {
		edao.writeAll();
	}

	@Override
	public void addEmp() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter eid");
		int eid = sc.nextInt();
		System.out.println("Enter name");
		String ename = sc.next();
		System.out.println("Enter Mobile");
		String mob = sc.next();
		Employee e = new Employee(eid, ename, mob);
		edao.save(e);
	}

	@Override
	public ArrayList<Employee> DisplayAll() {
		return edao.getAll();
	}

	@Override
	public boolean deletebyId(int id3) {

		return edao.delete(id3);
	}

}
