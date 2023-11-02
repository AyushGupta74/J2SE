package com.demo.test;

import java.util.HashSet;
import java.util.Set;

import com.demo.beans.Person;

public class TestHashSet {

	public static void main(String[] args) {
		Set<Integer> hs=new HashSet<>();
		boolean ans=hs.add(23);
		System.out.println("Anaswer : "+ans);
		hs.add(1);
		hs.add(100);
		hs.add(7);
		hs.add(20);
		ans=hs.add(23);
		System.out.println("Answer : "+ans);
		System.out.println(hs);
		Set<Person> hs1=new HashSet<>();
		hs1.add(new Person(10,"xxx","1111"));
		hs1.add(new Person(10,"xxx","1111"));
		hs1.add(new Person(10,"yyy","2222"));
		hs1.add(new Person(12,"yyy","2222"));
		System.out.println(hs1);
}

}
