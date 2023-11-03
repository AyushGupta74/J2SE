package com.demo.test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		Map<String,Integer> hm=new HashMap<>();
		//add new data
		hm.put("DBDA", 100);
		hm.put("DAC", 200);
		hm.put("DVLSI", 80);
		hm.put("DTISS", 120);
		//overwrite the previous value of the key
		hm.put("DAC", 250);
		System.out.println(hm.get("DAC"));
		//display all courses with capacity >100
		Set<String> s=hm.keySet();
		for(String s1:s) {
			if(hm.get(s1)>100)
			   System.out.println(s1+"--->"+hm.get(s1));
		}
		//to retrieve all the values
		// {("DBDA",[100,23,45]),("DTISS,120))
		Set<Map.Entry<String,Integer>> hset=hm.entrySet();
		for(Map.Entry<String,Integer> data:hset) {
			System.out.println(data.getKey()+"--->"+data.getValue());
		}
		String k="DHPCSA";
		Integer i=60;
		if(hm.containsKey(k)) {
			System.out.println("Key exists");
		}else{
			hm.put(k, i);
		}

	}

}




