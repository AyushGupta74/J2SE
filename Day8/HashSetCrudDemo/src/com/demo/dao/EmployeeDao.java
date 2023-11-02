package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void save(Employee e);

	Set<Employee> getAll();

	Employee getById(int id);

	boolean removeById(int id);

	boolean updateSalById(int id, double sal);

	Set<Employee> sortByName();

	Set<Employee> sortBySal();

	Employee[] findTopNEmployeesBySal(int n);

}
