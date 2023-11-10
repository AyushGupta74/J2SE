package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void save(Employee e);

	List<Employee> FindAll();

	Employee FindByID(int pick);

	void FindType(int pick);

	boolean ModifySal(int pick, int amt);

	boolean removeById(int pick);

	List<Employee> sortsalary();

	List<Employee> sortbyname();

}
