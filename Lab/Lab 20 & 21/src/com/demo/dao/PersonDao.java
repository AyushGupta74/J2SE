package com.demo.dao;

import java.util.Set;

import com.demo.beans.Employee;

public interface PersonDao {

	void save(Employee e);

	Set<Employee> findAll();

	Employee findbyid(int pick);

	boolean removebyid(int pick);

	void type(int id);

	boolean changesalbyid(int pick, double amt);

	Set<Employee> sortsalary();

	Set<Employee> sortbyname();

	Employee[] getnEmployee(int pick);

}
