package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.demo.beans.Contract;
import com.demo.beans.Employee;
import com.demo.beans.Salaried;
import com.demo.beans.Vendor;

public class EmployeeDaoImpl implements EmployeeDao {
	static List <Employee> elist;
	static {
		elist = new ArrayList<>();
		elist.add(new Salaried(12,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),4556,345));
 		elist.add(new Salaried(13,"Ajit","555","a22@gmail.com","admin","associate",LocalDate.of(2002, 10,30),4577,377));
 		elist.add(new Contract(14,"Rajas","666","r345@gmail.com","admin","manager",LocalDate.of(2002, 12,30),30,4000));
 		elist.add(new Contract(15,"Ashwini","777","ashu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),40,5000));
 		elist.add(new Vendor(16,"Ash","888","asu@gmail.com","Logistic","Supplier",LocalDate.of(2001, 2,10),600,1000));
		elist.add(new Vendor(17,"Raj","999","ahju@gmail.com","Logistic","Supplier",LocalDate.of(2002, 7,14),450,1200));
	}

	@Override
	public void save(Employee e) {
		elist.add(e);
	}

	@Override
	public List<Employee> FindAll() {
		return elist;
	}

	@Override
	public Employee FindByID(int pick) {
		for (Employee e : elist) {
			if (e.getPid() == pick) {
				return e;
			}
		}
		return null;
	}
	
	
	public int IndexInElist(int pick) {
		for (Employee e : elist) {
			if (e.getPid() == pick) {
				int a =  e.getPid();
				return a;
			}
		}
		return -1;
	}
	
	@Override
	public void FindType(int pick) {
		Employee e = FindByID(pick);
		if(e != null ) {
			if(e instanceof Salaried) {
				System.out.println("Salaried");
			}else if(e instanceof Contract) {
				System.out.println("Contract");
			}else if(e instanceof Vendor) {
				System.out.println("Vendor");
			}
		}		
	}
	
	public boolean ModifySal(int pick, int amt) {
		Employee e = FindByID(pick);
		if(e != null ) {
			if(e instanceof Salaried) {
				((Salaried)e).setSal(amt);
			}else if(e instanceof Contract) {
				((Contract)e).setCharges(amt);;
			}else if(e instanceof Vendor) {
				((Vendor)e).setRate(amt);
			}
			return true;
		}
		return false;
	}

	@Override
	public boolean removeById(int pick) {
		Employee e = FindByID(pick);
		return elist.remove(e);
	}

	@Override
	public List<Employee> sortsalary() {
		List<Employee> elst=new ArrayList<>();
		for(Employee e:elist) {
			elst.add(e);
		}
		Comparator<Employee> mysal=(o1,o2)->{
			double sal1 = 0,sal2=0;
			if(o1 instanceof Salaried) {
				sal1=((Salaried)o1).getSal();
				
			}
			else if(o1 instanceof Contract) {
				sal1=((Contract)o1).getCharges();
			}
			else {
				sal1=((Vendor)o1).getRate();
			}
			if(o2 instanceof Salaried) {
				sal2=((Salaried)o2).getSal();
				
			}
			else if(o2 instanceof Contract) {
				sal2=((Contract)o2).getCharges();
			}
			else {
				sal2=((Vendor)o2).getRate();
			}
			return (int)(sal2-sal1);
		};
		elst.sort(mysal);
		return elst;
	}
	
	public List<Employee> sortbyname(){
		List<Employee> elst=new ArrayList<>();
		for(Employee e:elist) {
			elst.add(e);
		}
		elst.sort(null);
		return elst;
	}

}
