package com.demo.service;

import java.util.Set;

import com.demo.beans.Employee;

public interface PersonService {

	void AddEmployee(int pick);

	Set<Employee> DisplayAll();

	Employee DisplayByid(int pick);

	boolean Deletebyid(int pick);

	boolean ModifySalbyid(int pick, double amt);

	void FindType(int pick);

	Set<Employee> Sortbysal();

	Set<Employee> SortbyName();

	Employee[] TopmostbySal(int pick);

}
