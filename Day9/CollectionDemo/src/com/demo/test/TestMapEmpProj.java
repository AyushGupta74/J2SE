package com.demo.test;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import com.demo.beans.Employee;
import com.demo.beans.Project;

public class TestMapEmpProj {

	public static void main(String[] args) {
		Map<Employee,Project> hm=new HashMap<>();
		hm.put(new Employee(12,"xxx","hr",3456), new Project(1,"aaa",10));
		hm.put(new Employee(12,"xxx","hr",3456), new Project(2,"bbb",11));
		System.out.println(hm);
		System.out.println("------------------------");
		TreeMap<Employee,Project> tm=new TreeMap<>();
		tm.put(new Employee(14,"xxx","hr",3456), new Project(1,"aaa",10));
		tm.put(new Employee(13,"xxx","hr",3456), new Project(2,"bbb",11));
		System.out.println(tm);
		SortedMap<Employee,Project>t1=tm.headMap(new Employee(14,"xxx","hr",3456));
		System.out.println(t1);
		tm.put(new Employee(12,"xxx","hr",3456), new Project(1,"aaa",10));
		System.out.println(t1);
	}

}
