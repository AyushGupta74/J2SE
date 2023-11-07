package com.demo.test;

import com.demo.enums.Coffee;

public class TestCoffee {

	public static void main(String[] args) {
		Coffee c=Coffee.medium;
		switch(c) {
		case small:
			System.out.println("you selected small "+c.getSize()+",Price : "+c.getPrice());
			break;
		case medium:
			System.out.println("you selected medium "+c.getSize()+",Price : "+c.getPrice());
			break;
		case big:
			System.out.println("you selected large "+c.getSize()+",Price : "+c.getPrice());
			break;
			
		}

	}

}
