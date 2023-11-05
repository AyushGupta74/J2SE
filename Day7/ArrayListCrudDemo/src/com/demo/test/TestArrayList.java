package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestArrayList {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeService eservice=new EmployeeServiceImpl();
		int choice=0;
		do {
		System.out.println("1. Add new Employee\n2. Delete employee by id\n 3. Modify salary\n");
		System.out.println("4. Display all\n5. Display by id\n 6. Sort by salary\n7. Sort by name\n8.Exit\n Choice: ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("1. salaried\n2.contract\n 3.vendor");
			int ch=sc.nextInt();
			eservice.addnewEmployee(ch);
			break;
		case 2:
			System.out.println("Enter ID for delete");
			int id=sc.nextInt();
			boolean status=eservice.deleteById(id);
			if(status) {
				System.out.println("Deleted successfully");
			}
			else {
				System.out.println("not found");
			}
			break;
		case 3:
			System.out.println("Enter ID for delete");
			id=sc.nextInt();
			System.out.println("Enter salary");
			double sal=sc.nextDouble();
			status=eservice.modifySalById(id,sal);
			if(status) {
				System.out.println("Modified successfully");
			}
			else {
				System.out.println("Not found");
			}
			break;
		case 4:
			List<Employee> elist=eservice.displayAll();
			if(elist!=null) {
				elist.stream().forEach(System.out::println);
			}
			break;
		case 5:
			System.out.println("Enter ID for search");
			 id=sc.nextInt();
			Employee e=eservice.displayById(id);
			if(e!=null) {
				System.out.println(e);
			}
			else {
				System.out.println("Not found");
			}
			break;
		case 6:
			break;
		case 7:
			List<Employee> elst=eservice.sortByName();
			elst.stream().forEach(System.out::println);
			break;
		case 8:
			sc.close();
			System.out.println("Thank you for visiting....");
			break;
		default:
			System.out.println("Wrong choice!");
		}
		}while(choice!=8);
	}

}
