package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeService {

	void addnewEmployee(int ch);

	Set<Employee> displayAll();

	Employee displayById(int id);

	boolean deleteById(int id);

	boolean modifySalById(int id, double sal);

	Set<Employee> sortByName();

	Set<Employee> sortBySalary();

	Employee[] getTopNEmployees(int n);

}
