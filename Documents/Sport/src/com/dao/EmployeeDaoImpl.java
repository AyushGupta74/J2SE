package com.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.beans.ContractEmployee;
import com.beans.Employee;
import com.beans.Person;
import com.beans.SalariedEmployee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	static List <Employee> elist;
	static {
		elist = new ArrayList<>();
		elist.add(new SalariedEmployee(12,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),4556,345));
		elist.add(new SalariedEmployee(13,"Ajit","555","a22@gmail.com","admin","associate",LocalDate.of(2002, 10,30),4577,377));
 		elist.add(new ContractEmployee(14,"Rajas","666","r345@gmail.com","admin","manager",LocalDate.of(2002, 12,30),30,4000));
 		elist.add(new ContractEmployee(15,"Ashwini","777","ashu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),40,5000));
	}
	@Override
	public void save(Employee e) {
		elist.add(e);
	}
	@Override
	public List<Employee> getAll() {
		return elist;
	}
	@Override
	public Employee getByID(int id) {
		for(Employee e:elist) {
			if(id== e.getPid()) {
				return e;
			}
		}
		return null;
	}
	public Employee getByID2(int id) {
		int pos = elist.indexOf(new SalariedEmployee(id));
		if (pos!=-1) {
			return elist.get(pos);
		}
		return null;
	}
	@Override
	public boolean removeByID(int id) {
		return elist.remove(new Person(id));	
	}
	@Override
	public Employee updateSal(int id, double sal) {
		Employee e = getByID(id);
		if(e!=null) {
			if(e instanceof SalariedEmployee) {
				((SalariedEmployee) e).setSal(sal);
			}
			if(e instanceof ContractEmployee) {
				((ContractEmployee) e).setCharge(sal);
			}
			return e;
		}
		return null;
	}
}