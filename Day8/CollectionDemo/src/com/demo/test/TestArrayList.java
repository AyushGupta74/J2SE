package com.demo.test;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import java.util.function.Predicate;

public class TestArrayList {

	public static void main(String[] args) {
		//create a ArrayList to store 10 values, accept these values from user
		//find addition of all the values
		//accept a number from user and delete it
		//display all the values
		List<Integer> lst=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.println("enetr data");
			int n=sc.nextInt();
			lst.add(n);
		}
		System.out.println(lst);
		
		//display data 1.5
		int s=0;
		for(int i=0;i<lst.size();i++) {
			s=s+lst.get(i);
		}
		System.out.println("addtion using for loop: "+s);
		//display data 1.7
		int s1=0;
		for(Integer num:lst) {  
			s1=s1+num;
		
		}
		System.out.println("addtion using foreach : "+s1);
		System.out.println("enetr the number for deletetion");
		int num=sc.nextInt();
		//to remove the value
		Iterator<Integer> it=lst.iterator();
		while(it.hasNext()) {
			int n=it.next();
			if(n==num) {
				it.remove();
			}
		}
		//to remove value using 1.8
		//to delete the first occurance
		lst.remove(new Integer(num));
		//Predicate p=(x)->(int)x==num;
		//lst.removeIf(p);
		//delete all the occurances of num from ArrayList
		lst.removeIf((x)->(int)x==(num));
		
		

	}

}
