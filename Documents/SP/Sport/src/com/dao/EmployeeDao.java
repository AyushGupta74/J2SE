package com.dao;

import java.util.List;

import com.beans.Employee;

public interface EmployeeDao {

	void save(Employee e);

	List<Employee> getAll();

	Employee getByID(int id);
	
	Employee getByID2(int id);

	boolean removeByID(int id);

	Employee updateSal(int id, double sal);

	List<Employee> sortBySal();

	List<Employee> sortByName();

	List<Employee> sortByDesg();
	
	Employee[] nTopmostSalary(int n);

}