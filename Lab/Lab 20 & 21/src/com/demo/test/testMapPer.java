package com.demo.test;

import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

import com.demo.beans.Employee;
import com.demo.service.PersonService;
import com.demo.service.PersonServiceImpl;

public class testMapPer {

	public static void main(String[] args) {
		PersonService serv = new PersonServiceImpl();
		Scanner sc = new Scanner(System.in);
		int choice =0;
		do {System.out.println("1. Add new Employee\n2. Display all\n 3. display by id");
		System.out.println("4. delete employee by id\n5. modify salary\n 6. sort by salary\n7. sort by name");
		System.out.println("8. Display n topmost based on salary \n9. exit\n choice:");
		choice=sc.nextInt();
		 switch(choice) {
		 case 1:
			 System.out.println("1. salaried\n2.contract\n 3.vendor");
			 int pick = sc.nextInt();
			 serv.AddEmployee(pick);
			 break;
		 case 2:
			 Set<Employee> elist = serv.DisplayAll();
			 if(elist!= null) {
				 elist.stream().forEach(System.out::println);
			 }
				 break;
		 case 3:
			 System.out.println("enter id");
			 pick = sc.nextInt();
			 Employee e = serv.DisplayByid(pick);
			 System.out.println(e);
			 break;
		 case 4:
			 System.out.println("enter id");
			 pick = sc.nextInt();
			 boolean status = serv.Deletebyid(pick);
			 System.out.println(status);
			 break;
		 case 5:
			 System.out.println("enter id");
			 pick = sc.nextInt();
			 serv.FindType( pick);
			 System.out.println("enter amount");
			 double amt  = sc.nextDouble();
			 status = serv.ModifySalbyid(pick, amt);
			 System.out.println(status);
			 break;
		 case 6:
			 elist  = serv.Sortbysal();
			 if(elist != null) {
				 elist.stream().forEach(System.out::println);
			 }
			 break;
		 case 7:
			 elist = serv.SortbyName();
			 if(elist != null) {
				 elist.stream().forEach(System.out::println);
			 }
			 break;
		 case 8:
			 System.out.println("enter number to pick");
			 pick = sc.nextInt();
			 Employee [] err = serv.TopmostbySal(pick);
			 Stream.of(err).forEach(System.out::println);
			 break;
		 case 9:
				sc.close();
				System.out.println("Thank you for visiting.....");
				break;
			default:
				System.out.println("wrong choice");
				break;
			 }
		 }while(choice !=9);
		
		}

	}

