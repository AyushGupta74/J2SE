package com.demo.test;

import java.util.Comparator;
import java.util.PriorityQueue;

import com.demo.beans.Person;

public class TestPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(12);
		pq.add(11);
		pq.add(20);
		System.out.println(pq);
		Comparator<Person> c=(o1,o2)->{
			int n=o1.getPname().compareTo(o2.getPname());
			System.out.println("in comparator   "+o1.getPname()+"-----"+o2.getPname()+"----"+n);
			return n;
			};
		PriorityQueue<Person> pq1=new PriorityQueue<>(c);
		pq1.add(new Person(11,"xxxx","33333"));
		pq1.add(new Person(12,"aaaa","33333"));
		pq1.add(new Person(10,"bbbb","33333"));
		pq1.add(new Person(3,"yyyy","66666"));
		System.out.println(pq1);
		System.out.println(pq1);
		
		for(Person p:pq1) {
			System.out.println(p);
		}
		System.out.println("----peek----");
		System.out.println(pq1.peek());
		System.out.println("----poll----");
		while(!pq1.isEmpty()) {
		   System.out.println(pq1.poll());
		}
		
	}

}
