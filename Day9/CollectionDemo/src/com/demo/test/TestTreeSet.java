package com.demo.test;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(7);
		ts.add(1);
		ts.add(100);
		ts.add(50);
		ts.add(17);
		ts.add(11);
		ts.add(1100);
		ts.add(150);
		System.out.println(ts);
		TreeSet t1=(TreeSet) ts.headSet(17);
		TreeSet t2=(TreeSet) ts.tailSet(17);
		System.out.println(t1);
		System.out.println(t2);
		ts.add(4);
		ts.add(110);
		ts.add(1200);
		ts.add(160);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(ts.higher(13));
	}
}
