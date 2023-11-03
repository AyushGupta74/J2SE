package com.demo.test;

import java.util.Enumeration;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>(50,10);
		v.add(10);
		v.add(20);
		v.add(5);
		v.add(10);
		System.out.println(v.get(1)); //to retrieve the value at the given index position
		System.out.println(v);
		System.out.println("Capacity : "+v.capacity());
		System.out.println("Size : "+v.size());
		for(int i=0;i<10;i++) {
			v.add(i+100);
		}
		System.out.println(v);
		System.out.println("Capacity : "+v.capacity());
		System.out.println("Size : "+v.size());
		for(int i=0;i<10;i++) {
			v.add(i+200);
		}
		
		System.out.println(v);
		System.out.println("Capacity : "+v.capacity());
		System.out.println("Size : "+v.size());
		Enumeration e=v.elements();
		System.out.println("using enumeration");
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		//display data 1.5
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
		}
		//display data 1.7
		for(Integer num:v) {
			System.out.println(num);
		}	
		//display data 1.8
		v.stream().forEach(x->System.out.println(x));
		v.stream().forEach(System.out::println);
	}

}
