package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.demo.beans.ContractEmployee;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;

public class EmployeeDaoImpl implements EmployeeDao {
    static Map<Integer,Employee> hm;
    static {
    	hm=new HashMap<>();
    	hm.put(12,new SalariedEmp(12,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),4556,345));
 		hm.put(13,new SalariedEmp(13,"Ajit","555","a22@gmail.com","admin","associate",LocalDate.of(2002, 10,30),4577,377));
 		hm.put(14,new ContractEmployee(14,"Rajas","666","r345@gmail.com","admin","manager",LocalDate.of(2002, 12,30),30,4000));
 		hm.put(15,new ContractEmployee(15,"Ashwini","777","ashu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),40,5000));
 		hm.put(16,new ContractEmployee(16,"Ashwini","777","ashu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),40,5000));
    }
	@Override
	public void save(Employee e) {
		if(!hm.containsKey(e.getPid())) {
			hm.put(e.getPid(), e);
		}
		
	}

	@Override
	public List<Employee> getAll() {
		return (List<Employee>)hm.values();
	}

	@Override
	public Employee getById(int id) {
		return hm.get(id);
	}

	@Override
	public boolean removeById(int id) {
		Employee e=hm.remove(id);
		if(e!=null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateSalById(int id, double sal) {
		Employee ob=hm.get(id);
		if(ob!=null) {
			if(ob instanceof SalariedEmp) {
				((SalariedEmp) ob).setSal(sal);
			}else if(ob instanceof ContractEmployee) {
				((ContractEmployee) ob).setCharges(sal);
			}else {
				//vendor
			}
			return true;
		}
		return false;
	}

	
	@Override
	public List<Employee> sortBySal() {
		Comparator<Employee> c=(o1,o2)->{
			double sal1=0,sal2=0;
			if(o1 instanceof SalariedEmp)
				sal1=((SalariedEmp) o1).getSal();
			else if(o1 instanceof ContractEmployee) {
				sal1=((ContractEmployee) o1).getCharges();
			}else {
				//vendor
			}
			if(o2 instanceof SalariedEmp)
				sal2=((SalariedEmp) o2).getSal();
			else if(o2 instanceof ContractEmployee) {
				sal2=((ContractEmployee) o2).getCharges();
			}else {
				//vendor
			}
			return (int)(sal1-sal2);
		};
		List<Employee> elst=(List<Employee>) hm.values();
		elst.sort(c);
		return elst;
	}

	@Override
	public Employee[] findTopNEmployeesBySal(int n) {
		List<Employee> elst=sortBySal();
		Employee[] earr=new Employee[n];
		for(int i=0;i<n;i++) {
			earr[i]=elst.get(i);
		}
		return earr;
	}

	@Override
	public List<Employee> findBySalary(double sal) {
		List<Employee> elist=(List<Employee>)hm.values();
		List<Employee> selected=new ArrayList<>();
		for(Employee e:elist) {
			if(e instanceof SalariedEmp) {
				if(((SalariedEmp) e).getSal()>sal) {
					selected.add(e);
				}
			}else if (e instanceof ContractEmployee) {
				if(((ContractEmployee) e).getCharges()>sal)
					selected.add(e);
			}else {
				//vendor
			}
			
		}
		if(selected.size()>0) {
			return selected;
		}
		return null;
	}

	@Override
	public TreeMap<Integer, Employee> sortById() {
		TreeMap<Integer,Employee> tm=new TreeMap<>();
		Set<Integer> ks=hm.keySet();  //{12,13,14,15,16,17}
		for(Integer ob:ks) {
			tm.put(ob, hm.get(ob));
		}
		return tm;
	}

	
}
