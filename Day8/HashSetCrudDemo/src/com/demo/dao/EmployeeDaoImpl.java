package com.demo.dao;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.List;
import java.util.Set;

import com.demo.beans.ContractEmployee;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;

public class EmployeeDaoImpl implements EmployeeDao{
	static Set<Employee> hs;
	static {
		hs=new HashSet<>();
		hs.add(new SalariedEmp(12,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),4556,345));
 		hs.add(new SalariedEmp(13,"Ajit","555","a22@gmail.com","admin","associate",LocalDate.of(2002, 10,30),4577,377));
 		hs.add(new ContractEmployee(14,"Rajas","666","r345@gmail.com","admin","manager",LocalDate.of(2002, 12,30),30,4000));
 		hs.add(new ContractEmployee(15,"Ashwini","777","ashu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),40,5000));
 		hs.add(new ContractEmployee(15,"Ashwini","777","ashu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),40,5000));
	}
	

	@Override
	public void save(Employee e) {
		
		hs.add(e);
	}

	@Override
	public Set<Employee> getAll() {
		return hs;
	}

	@Override
	public Employee getById(int id) {
		for(Employee e:hs) {
			if(e.getPid()==id) {
				return e;
			}
		}
		return null;
	}

	@Override
	public boolean removeById(int id) {
		return hs.remove(new SalariedEmp(id) );
	}

	@Override
	public boolean updateSalById(int id, double sal) {
		Employee e=getById(id);
		if(e!=null) {
			if(e instanceof SalariedEmp) {
				((SalariedEmp) e).setSal(sal);
			}
			else if(e instanceof ContractEmployee) {
				((ContractEmployee) e).setCharges(sal);
			}else {
				//vendor
			}
			return true;
		}
		return false;
	}

	@Override
	public Set<Employee> sortByName() {
		TreeSet<Employee> ts=new TreeSet<>();
		for(Employee e:hs) {
			ts.add(e);
		}
		return ts;
	}

	@Override
	public Set<Employee> sortBySal() {
		Comparator<Employee> mysal=(o1,o2)->{
			double sal1=0,sal2=0;
			if(o1 instanceof SalariedEmp) {
				sal1=((SalariedEmp) o1).getSal();
			}
			else if (o1 instanceof ContractEmployee) {
				sal1=((ContractEmployee) o1).getCharges();
			}
			else {
				//vendor
			}
			if(o2 instanceof SalariedEmp) {
				sal2=((SalariedEmp) o2).getSal();
			}
			else if (o2 instanceof ContractEmployee) {
				sal2=((ContractEmployee) o2).getCharges();
			}
			else {
				//vendor
			}
			return (int)(sal1-sal2);
			};
			TreeSet<Employee> ts=new TreeSet<>(mysal);
			for(Employee e:hs) {
				ts.add(e);
			}
			
			return ts;
	}

	@Override
	public Employee[] findTopNEmployeesBySal(int n) {
		Set<Employee> ts=sortBySal();
		Employee[] earr=new Employee[n];
		int cnt=0;
		for(Employee e:ts) {
			earr[cnt]=e;
			cnt++;
			if(cnt==n)
				break;
			
		}
		return earr;
		
	}

}
