package com.demo.dao;

import com.demo.beans.Person;

public interface PersonDao {

	void save(Person p);

	Person[] findAll();

	

	Person findById(int pid);

}
