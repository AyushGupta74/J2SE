package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	void addEmployee(int pick);

	List<Employee> DisplayAll();

	Employee DisplayByID(int pick);

	void FindTypeofEmp(int pick);

	boolean UpdateSalbyID(int pick, int amt);

	boolean DeleteById(int pick);

	List<Employee> Sortbysal();

	List<Employee> SortbyName();


	
}
