package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class Test {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		EmployeeService eserv = new EmployeeServiceImpl();
		int choice=0;
		do {System.out.println("1. Add new Employee\n2. Display all\n3. display by id\n4. modify salary\n5. delete employee by id\n6. sort by salary\n7. sort by name\n8. exit\n choice: ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("1. salaried\n2.contract\n 3.vendor\n");
			int pick = sc.nextInt();
			eserv.addEmployee(pick);
			break;
		case 2:
			List<Employee> elist = eserv.DisplayAll();
			if(elist != null) {
				for(Employee e: elist) {
					System.out.println(e);
				}
			}
			break;
		case 3:
			System.out.println("enter ID");
			pick = sc.nextInt();
			Employee e = eserv.DisplayByID(pick);
			System.out.println(e);
			break;
		case 4:
			System.out.println("enter ID");
			pick = sc.nextInt();
			eserv.FindTypeofEmp(pick);
			System.out.println("enter salary");
			int amt = sc.nextInt();
			boolean status = eserv.UpdateSalbyID(pick,amt); 
			System.out.println(status);
			break;
		case 5:
			System.out.println("enter id");
			pick = sc.nextInt();
			status = eserv.DeleteById(pick);
			System.out.println(status);
			break;
		 case 6:
			 elist  = eserv.Sortbysal();
			 if(elist != null) {
				 elist.stream().forEach(System.out::println);
			 }
			 break;
		 case 7:
			 elist = eserv.SortbyName();
			 if(elist != null) {
				 elist.stream().forEach(System.out::println);
			 }
			 break;
		 case 8:
				sc.close();
				System.out.println("Thank you for visiting....");
				break;
		default:
			System.out.println("wrong choice");
		}
		}while(choice != 8);
	}

}
