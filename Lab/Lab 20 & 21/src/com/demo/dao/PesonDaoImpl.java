package com.demo.dao;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;
import com.demo.beans.Vendor;

public class PesonDaoImpl implements PersonDao {
	static Set<Employee> hs;
	static {
		hs = new HashSet<>();
		hs.add(new SalariedEmp(12,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),4556,345));
 		hs.add(new SalariedEmp(13,"Ajit","555","a22@gmail.com","admin","associate",LocalDate.of(2002, 10,30),4577,377));
 		hs.add(new ContractEmp(14,"Rajas","666","r345@gmail.com","admin","manager",LocalDate.of(2002, 12,30),30,4000));
 		hs.add(new ContractEmp(15,"Ashwini","777","ashu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),40,5000));
 		hs.add(new Vendor(16,"Ash","888","asu@gmail.com","Logistic","Supplier",LocalDate.of(2001, 2,10),600,1000));
		hs.add(new Vendor(17,"Raj","999","ahju@gmail.com","Logistic","Supplier",LocalDate.of(2002, 7,14),450,1200));
	}
	
	@Override
	public void save(Employee e) {
		hs.add(e);		
	}

	@Override
	public Set<Employee> findAll() {
		return hs;
	}

	@Override
	public Employee findbyid(int pick) {
		for(Employee e : hs) {
			if(e.getPid() == pick) {
				return e;
			}
		}
		return null;
		
	}

	@Override
	public boolean removebyid(int pick) {
		Employee e = findbyid(pick);
		return hs.remove(e);
	}


	public boolean changesalbyid(int id, double amt){
		Employee e = findbyid(id);
		if(e != null) {
			if(e instanceof SalariedEmp) {
				((SalariedEmp)e).setSal(amt);
			}else if(e instanceof ContractEmp) {
				((ContractEmp)e).setCharges(amt);
			}else if(e instanceof Vendor) {
				((Vendor)e).setRate(amt);
			}
			return true;
		}else {
			return false;
		}
	}

	public void type(int id){
		Employee e = findbyid(id);
		if(e != null) {
			if(e instanceof SalariedEmp) {
				System.out.println("Salary Emp");
			}else if(e instanceof Vendor) {
				System.out.println("Vendor");
			}else if(e instanceof ContractEmp) {
				System.out.println("Contract Emp");
			}
		}

	}

	@Override
	public Set<Employee> sortsalary(){
		Comparator<Employee> mysal=(o1,o2)->{
			double sal1=0, sal2=0;
			if(o1 instanceof SalariedEmp) {
				sal1 = ((SalariedEmp) o1).getSal();
			}else if(o1 instanceof ContractEmp) {
				sal1 = ((ContractEmp) o1).getCharges();
			}else if(o1 instanceof Vendor){
				sal1 = ((Vendor) o1).getRate();
			}
			
			if(o2 instanceof SalariedEmp) {
				sal2 = ((SalariedEmp) o2).getSal();
			}else if(o2 instanceof ContractEmp) {
				sal2 = ((ContractEmp) o2).getCharges();
			}else if(o2 instanceof Vendor){
				sal2 = ((Vendor) o2).getRate();
			}
			return (int)(sal1-sal2);
		};
		TreeSet<Employee> ts = new TreeSet<>(mysal);
		for(Employee e:hs) {
			ts.add(e);
			
		}return ts;
		
	}

	public Set<Employee> sortbyname() {
		TreeSet<Employee> ts = new TreeSet<>();
		for(Employee e : hs) {
			ts.add(e);
		}
		return ts;
	}

	@Override
	public Employee[] getnEmployee(int pick) {
		Set<Employee> es = sortsalary();
		Employee[] err =new Employee [pick];
		int cnt=0;
		for(Employee e:es) {
			err[cnt] = e;
			cnt++;
			if(cnt == pick) {
				break;
			}
		}
		return err;
	}	
}
