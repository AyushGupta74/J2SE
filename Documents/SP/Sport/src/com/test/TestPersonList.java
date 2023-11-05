package com.test;

import java.util.ArrayList;

import com.beans.Person;

public class TestPersonList {

	public static void main(String[] args) {
		ArrayList<Person> plist=new ArrayList<>();
		plist.add(new Person(10,"Ashwini","44444","ay@"));
		plist.add(new Person(11,"Rajat","5555","ay@"));
		plist.add(new Person(12,"Archana","5555","ay@"));
		plist.add(new Person(13,"Mugdha","5555","ay@"));
        System.out.println(plist);
        int pos=plist.indexOf(new Person(100,null,null,null));
        System.out.println(pos);
        plist.remove(new Person(11));
        System.out.println(plist);
	}

}
