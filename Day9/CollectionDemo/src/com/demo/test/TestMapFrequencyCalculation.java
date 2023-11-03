package com.demo.test;

import java.util.HashMap;
import java.util.Map;

public class TestMapFrequencyCalculation {
	public static void main(String[] args) {
		Integer[] arr= {12,13,10,23,1,23,10,10,23,10,45,5,13};
		Map<Integer,Integer> hm=new HashMap<>();
		for(Integer num:arr) {
			if(hm.containsKey(num)) {
				int val=hm.get(num);
				hm.put(num, val+1);
			}else {
				hm.put(num, 1);
			}
		}
		System.out.println(arr);
		System.out.println(hm);
		
	}
}
