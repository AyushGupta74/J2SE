package com.demo.dao;

import java.util.List;
import java.util.Set;
import java.util.TreeMap;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void save(Employee e);

	List<Employee> getAll();

	Employee getById(int id);

	boolean removeById(int id);

	boolean updateSalById(int id, double sal);

	

	List<Employee> sortBySal();

	Employee[] findTopNEmployeesBySal(int n);

	List<Employee> findBySalary(double sal);

	TreeMap<Integer, Employee> sortById();

}
