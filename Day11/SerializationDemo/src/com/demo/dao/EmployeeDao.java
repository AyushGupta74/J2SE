package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void readDataFromFile();

	void save(Employee e);

	List<Employee> findAll();

	boolean removeById(int eid);

	void writeDataToFile();

}
