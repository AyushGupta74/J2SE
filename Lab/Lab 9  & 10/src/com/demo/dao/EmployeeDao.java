package com.demo.dao;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void addNew(Employee e);

	Employee[] findAllObjects();

}
