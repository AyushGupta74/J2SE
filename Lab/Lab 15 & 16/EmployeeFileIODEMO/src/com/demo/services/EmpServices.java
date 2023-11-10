package com.demo.services;

import java.util.ArrayList;

import com.demo.beans.Employee;

public interface EmpServices {

	void ReadFile();

	void WriteFile();

	void addEmp();

	ArrayList<Employee> DisplayAll();

	boolean deletebyId(int id3);

}
