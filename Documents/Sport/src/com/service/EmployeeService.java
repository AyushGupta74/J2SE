package com.service;

import java.util.List;

import com.beans.Employee;

public interface EmployeeService {

	void addNewEmployee(int ch);

	List<Employee> displayAllEmployee();

	Employee displayByID(int id);

	Employee displayByID2(int id);

	boolean deleteByID(int id);

	Employee modifySal(int id, double sal);

}
