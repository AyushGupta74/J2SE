package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Person;
import com.demo.service.PersonService;
import com.demo.service.PersonServiceImpl;

public class TestPersonArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		PersonService ps=new PersonServiceImpl();
		do {
			
			System.out.println("1.add new person\n 2. display by id\n3. display all\n4. exit\n choice:");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				ps.addNewPerson();
				break;
			case 2:
				System.out.println("enetr pid");
				int pid=sc.nextInt();
				Person p=ps.displayById(pid);
				if(p!=null) {
					System.out.println(p);
				}
				else {
					System.out.println("not found");
				}
				break;
			case 3:
				Person[] arr=ps.displayAll();
				for(Person p1:arr) {
					if(p1!=null)
					   System.out.println(p1);
					else
						break;
				}
				break;
			case 4:
				System.out.println("Thank you for visiting...");
				sc.close();
				break;
			default:
				System.out.println("wrong choice");
			}
		}while(choice!=4);

	}

}
