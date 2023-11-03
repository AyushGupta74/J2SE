package com.demo.test;

import java.util.HashMap;
import java.util.Map;

import com.demo.beans.Employee;

public class TestMapSumSal {

	public static void main(String[] args) {
		Employee[] earr= {new Employee(12,"Rajan","Game",34567),
				new Employee(13,"Atahrva","uI",45678),
				new Employee(14,"Revati","uI",45678)};
		Map<String,Double> hm=new HashMap<>();
		for(int i=0;i<earr.length;i++) {
			if(hm.containsKey(earr[i].getDept())) {
				double val= hm.get(earr[i].getDept());
				hm.put(earr[i].getDept(),val+earr[i].getSal());
			}else{
				hm.put(earr[i].getDept(), earr[i].getSal());
			}
		}

	}

}
