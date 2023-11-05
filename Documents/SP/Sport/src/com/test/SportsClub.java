package com.test;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import com.beans.Employee;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;

public class SportsClub {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int choice =0;
		EmployeeService es = new EmployeeServiceImpl();
		
		do {
			System.out.println("\n1. Add new employee\n2. Display by ID\n3. Display all employee");
			System.out.println("4. Delete by ID\n5. Modify salary\n6. Sort employee by salary\n7. Sort employee by name");
			System.out.println("8. Sort employee by deisgnation\n9. Display n topmost employee based on salary\n10. Exit\nEnter choice : ");
			choice =sc.nextInt();
			
			switch(choice) {
			
				case 1:
					System.out.println("1. Salaried\n2. Contract\n3. Vendor\nEnter choice : ");
					int ch = sc.nextInt();
					es.addNewEmployee(ch);
					break;
					
				case 2:
					System.out.println("Enter employeeID for searching: ");
					int id = sc.nextInt();
					Employee e = es.displayByID(id);
//		OR			Employee e = es.displayByID2(id);
					if (e!=null){
						System.out.println("Found!");
						System.out.println(e);
					}
					else {
						System.out.println("ID Not found!");
					}
					break;
					
				case 3:
					List<Employee> elist = es.displayAllEmployee();
					if (elist!= null) {
						for(Employee e1: elist) {
							System.out.println(e1);
						}
//		OR				Stream.of(elist).forEach(System.out::println);
//		OR				elist.stream().forEach(System.out::println);
					}
					break;
					
				case 4:
					System.out.println("Enter employeeID for deleting: ");
					id = sc.nextInt();
					boolean status = es.deleteByID(id);
					if (status){
						System.out.println("Deleted successfully");
					}
					else {
						System.out.println("ID Not found!");
					}
					break;
					
				case 5:
					System.out.println("Enter employeeID : ");
					id = sc.nextInt();
					System.out.println("Enter Salary : ");
					double sal = sc.nextInt();
					e = es.modifySal(id,sal);
					if (e!=null){
						System.out.println("Salary modified successfully!");
						System.out.println(e);
					}
					else {
						System.out.println("ID Not found!");
					}
					break;
					
				case 6:
					System.out.println("Employee sorted based on salary.");
					List<Employee> elst = es.sortBySalary();
					elst.stream().forEach(System.out::println);
					break;
					
				case 7:
					System.out.println("Employee sorted based on name.");
					List<Employee> elst1 = es.sortByName();
					elst1.stream().forEach(System.out::println);
					break;
					
				case 8:
					System.out.println("Employee sorted based on designation.");
					List<Employee> elst2 = es.sortByDesg();
					elst2.stream().forEach(System.out::println);
					break;
					
				case 9:
					System.out.println("How many topmost employee based on salary you want?");
					int num = sc.nextInt();
					Employee[] e1= es.nTopmostSalary(num);
					Stream.of(e1).forEach(System.out::println);
					break;
					
				case 10:
					sc.close();
					System.exit(0);
					break;
					
				default:
					System.out.println("\n!!! Please enter correct choice !!!\n");
					
				}
			
			}while(choice!=10);
	}
}
