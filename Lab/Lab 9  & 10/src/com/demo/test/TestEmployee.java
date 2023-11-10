package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployee {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int choice ;
		EmployeeService es = new EmployeeServiceImpl();
		do
		{
			System.out.println("1 for add new object\n2.display All Objects\n3.exit");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				es.addNewObject();
				break;
			case 2:
				Employee arr[] = es.displayObjects();
				if(arr!=null)
				{
					for(int i=0;i<arr.length;i++)
					{
						if(arr[i]==null)
						{
							break;
						}
						System.out.println(arr[i]);
					}
				}
				
				break;
			case 3:
				System.out.println("Thank You :");
				break;
				default :
					System.out.println("wrong choice : ");
			}
		}while(choice!=3);
		
	}

}
