package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmpCrudDemo {

	public static void main(String[] args) {
		EmployeeService eservice=new EmployeeServiceImpl();
		eservice.ReadFromFile();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do{
		System.out.println("1. Add new employee \n 2. delete the employee\n3. display All\n4. exit\n choice:");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			eservice.addNewEmployee();
			break;
		case 2:
			System.out.println("enetr id to delete");
			int eid=sc.nextInt();
			boolean status=eservice.deleteById(eid);
			if(status)
				System.out.println("deleted successfully");
			else {
				System.out.println("not found");
			}
			break;
		case 3:
			List<Employee> elst=eservice.getAllEmployees();
			elst.stream().forEach(System.out::println);
			break;
		case 4:
			eservice.writToFile();
			sc.close();
			System.out.println("thank you for visiting....");
			break;
		default:
			System.out.println("wrong choice");
		}
		}while(choice!=4);		

	}

}
