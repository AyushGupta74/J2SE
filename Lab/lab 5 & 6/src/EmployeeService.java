package Employee.src;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EmployeeService {
	static Employee[] err;
	static int cnt;
	static {
		err = new Employee[100];
		err[0]=new SalariedEmp(12,"Rajat","4444","a@gmail.com","hr","associate",LocalDate.of(2002, 12,30),4556,345);
		err[1]=new SalariedEmp(13,"Ajit","555","a22@gmail.com","admin","associate",LocalDate.of(2002, 10,30),4577,377);
		err[2]=new ContractEmp(14,"Rajas","666","r345@gmail.com","admin","manager",LocalDate.of(2002, 12,30),30,4000);
		err[3]=new ContractEmp(15,"Ashwini","777","ashu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),40,5000);
		err[4]=new Vendor(16,"Ash","888","asu@gmail.com","Logistic","Supplier",LocalDate.of(2001, 2,10),600,1000);
		err[5]=new Vendor(17,"Raj","999","ahju@gmail.com","Logistic","Supplier",LocalDate.of(2002, 7,14),450,1200);
		cnt = 6;
	}
	
	//insert employee details
	public static void addEmployee(int pick) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int pid = sc.nextInt();
		System.out.println("enter name");
		String pname = sc.next();
		System.out.println("enter Mobile no.");
		String mobile = sc.next();
		System.out.println("enter emailID");
		String email = sc.next();
		System.out.println("enter department");
		String dept = sc.next();
		System.out.println("enter designation");
		String desg = sc.next();
		System.out.println("enter date of joining(dd/mm/yyyy)");
		String dt = sc.next();
		LocalDate doj = LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/mm/yyyy"));
		switch(pick) {
		//Add Salaried Employee Details
		case 1:
			System.out.println("enter salary");
			double s = sc.nextDouble();
			System.out.println("Enter bonus");
			double b = sc.nextDouble();
			err[cnt] = new SalariedEmp(pid,pname,mobile,email,dept,desg,doj,s,b);
			break;
		case 2:
			//Add Contract Employee Details
			System.out.println("enter hours");
			int hrs = sc.nextInt();
			System.out.println("enter charges");
			double charges = sc.nextDouble();
			err[cnt] = new ContractEmp(pid,pname,mobile,email,dept,desg,doj,hrs,charges);
			break;
		case 3:
			//Add Vendor Details
			System.out.println("enter rate");
			double rate = sc.nextDouble();
			System.out.println("enter quantity");
			int qty = sc.nextInt();
			err[cnt] = new Vendor(pid,pname,mobile,email,dept,desg,doj,rate,qty);
		}
		cnt++;
		sc.close();
	}
	
	//Display All Details
	public static void displayAll() {
		for(Employee e : err) {
			if(e != null) {
				System.out.println(e);
			}else {
				break;
			}
		}
	}
	
	//Display details by ID
	public static void displaybyId(int id) {
		int pos = findID(id);
		System.out.println(err[pos]);
		
	}
	
	//Find By ID
	public static int findID(int id) {
		for(int i=0; i<cnt; i++) {
			if(err[i].getPid() == id) {
				return i;
			}
		}
		return -1;
	}
	
	//Modify Salary by ID
	public static boolean modifySalbyId(int id, double amt) {
		int pos = findID(id);
		if(pos != -1) {
			if(err[pos] instanceof SalariedEmp) {
				((SalariedEmp)err[pos]).setSal(amt);
			}else if(err[pos] instanceof ContractEmp) {
				((ContractEmp)err[pos]).setCharges(amt);
			}else if(err[pos] instanceof Vendor) {
				((Vendor)err[pos]).setRate(amt);
			}
			return true;
		}else {
			return false;
		}
	}
	
	
	//Find Type of Employee by ID
	public static void FindType(int id) {
		int pos = findID(id);
		if(pos != -1) {
			if(err[pos] instanceof SalariedEmp) {
				System.out.println("Salary Emp");
			}else if(err[pos] instanceof Vendor) {
				System.out.println("Vendor");
			}else if(err[pos] instanceof ContractEmp) {
				System.out.println("Contract Emp");
			}
		}
	}
	
	//Calculate Salary by ID
	public static double CalculateSalbyID(int id) {
		int pos = findID(id);
		if(pos != -1) {
			return err[pos].calculateSal();
		}
		return -1;
	}
	
	//Calculate Bonus By ID
	public static void CalculateBonus(int id) {
		int pos = findID(id);
		if(pos != -1) {
			if(err[pos] instanceof SalariedEmp) {
				System.out.println("Salaried Employee Bonus : "+((SalariedEmp)err[pos]).calculateBonus());
			}else if(err[pos] instanceof Vendor) {
				System.out.println("no bonus for Vendor");
			}else if(err[pos] instanceof ContractEmp) {
				System.out.println("no bonus for contract employee");
			}
		}else {
			System.out.println("Not Found");
		}
	}
	
}
