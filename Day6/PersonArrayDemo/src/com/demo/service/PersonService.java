package com.demo.service;

import com.demo.beans.Person;

public interface PersonService {

	void addNewPerson();

	Person[] displayAll();

	Person displayById(int pid);

}
