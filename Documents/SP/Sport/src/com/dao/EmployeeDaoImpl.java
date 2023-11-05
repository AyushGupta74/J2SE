package com.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.beans.ContractEmployee;
import com.beans.Employee;
import com.beans.Person;
import com.beans.SalariedEmployee;
import com.beans.Vendors;

public class EmployeeDaoImpl implements EmployeeDao{
	
	static List <Employee> elist;
	static {
		elist = new ArrayList<>();
		elist.add(new SalariedEmployee(14,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),4556,345));
		elist.add(new SalariedEmployee(13,"Ajit","555","a22@gmail.com","admin","associate",LocalDate.of(2002, 10,30),4577,377));
 		elist.add(new ContractEmployee(15,"Rajas","666","r345@gmail.com","admin","manager",LocalDate.of(2002, 12,30),3000,40));
 		elist.add(new ContractEmployee(12,"Ashwini","777","ashu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),4000,50));
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
	@Override
	public List<Employee> sortBySal() {
		List<Employee> listSal = new ArrayList<>();
		for(Employee e:elist) {
			listSal.add(e);
		}
		Comparator<Employee> cemp = (obj1, obj2)->{
			double sal1=0,sal2=0;
			if (obj1 instanceof SalariedEmployee) {
				sal1 = ((SalariedEmployee) obj1).getSal();
			}
			if (obj1 instanceof ContractEmployee) {
				sal1 = ((ContractEmployee) obj1).getCharge();
			}
			if (obj1 instanceof Vendors) {
				sal1 = ((Vendors) obj1).getAmount();
			}
			if (obj2 instanceof SalariedEmployee) {
				sal2 = ((SalariedEmployee) obj2).getSal();
			}
			if (obj2 instanceof ContractEmployee) {
				sal2 = ((ContractEmployee) obj2).getCharge();
			}
			if (obj2 instanceof Vendors) {
				sal2 = ((Vendors) obj2).getAmount();
			}
			return (int)(sal2-sal1);
		}; 
		listSal.sort(cemp);
		return listSal;
	}
	@Override
	public List<Employee> sortByName() {
		List<Employee> listSal = new ArrayList<>();
		for(Employee e:elist) {
			listSal.add(e);
		}
		Comparator<Employee> name = (obj1,obj2)->{
			return obj1.getPname().compareTo(obj2.getPname());
		};
		listSal.sort(name);
		return listSal;
	}
	@Override
	public List<Employee> sortByDesg() {
		List<Employee> listSal = new ArrayList<>();
		for(Employee e:elist) {
			listSal.add(e);
		}
		Comparator<Employee> desg = (obj1,obj2)->{
			return obj1.getDesignation().compareTo(obj2.getDesignation());
		};
		listSal.sort(desg);
		return listSal;
	}
	@Override
	public Employee[] nTopmostSalary(int n) {
		List<Employee> list = sortBySal();
		Employee[] e = new Employee[n];
		for(int i=0;i<n;i++) {
			e[i] = list.get(i);
		}
		return e;
	}
}