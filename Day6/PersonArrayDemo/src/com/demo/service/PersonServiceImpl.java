package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Person;
import com.demo.dao.PersonDao;
import com.demo.dao.PersonDaoImpl;

public class PersonServiceImpl implements PersonService {
	private PersonDao pdao;
	public PersonServiceImpl() {
		pdao=new PersonDaoImpl();
	}
	@Override
	public void addNewPerson() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr id");
		int pid=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter mobile");
		String mob=sc.next();
		Person p=new Person(pid,nm,mob);
		pdao.save(p);
	}
	@Override
	public Person[] displayAll() {
		return pdao.findAll();
	}
	@Override
	public Person displayById(int pid) {
		return pdao.findById(pid);
	}

}
