package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.exceptions.InvalidSalaryException;

public interface EmployeeDao {

	void save(Employee e);

	List<Employee> getAll();

	Employee getById(int id);

	boolean removeById(int id);

	boolean updateSalById(int id, double sal) throws InvalidSalaryException;

	List<Employee> sortByName();

	List<Employee> sortBySal();

	Employee[] findTopNEmployeesBySal(int n);

}
