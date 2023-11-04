package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.exceptions.InvalidSalaryException;

public interface EmployeeService {

	void addnewEmployee(int ch) throws InvalidSalaryException;

	List<Employee> displayAll();

	Employee displayById(int id);

	boolean deleteById(int id);

	boolean modifySalById(int id, double sal) throws InvalidSalaryException;

	List<Employee> sortByName();

	List<Employee> sortBySalary();

	Employee[] getTopNEmployees(int n);

}
