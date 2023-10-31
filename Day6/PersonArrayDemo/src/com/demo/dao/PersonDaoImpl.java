package com.demo.dao;

import com.demo.beans.Person;

public class PersonDaoImpl implements PersonDao {
	static Person[] parr;
	private static int cnt;
	static {
		parr=new Person[100];
		parr[0]=new Person(1,"xxx","33333");
		parr[1]=new Person(2,"yyy","44444");
		cnt=2;
	}
	
    // add a new personat cnt position in the array
	@Override
	public void save(Person p) {
		parr[cnt]=p;
		cnt++;
		
	}

	//returns list of all persons
	@Override
	public Person[] findAll() {
		return parr;
	}

	//find the person object by id, return person object if found 
	//otherwise returns null
	@Override
	public Person findById(int pid) {
		for(Person p:parr) {
			if(p!=null) {
				if(p.getPid()==pid) {
					return p;
				}
			}
			else {
				break;
			}
		}
		return null;
	}

}
