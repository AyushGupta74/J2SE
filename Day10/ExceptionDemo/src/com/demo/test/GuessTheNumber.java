package com.demo.test;

import java.util.Scanner;

import com.demo.exceptions.WrongNumberException;

public class GuessTheNumber {
public static void main(String[] args) {
	int num=67;
	Scanner sc=new Scanner(System.in);
	while(true) {
	try {
		System.out.println("enter number");
		int n=sc.nextInt();
		if(n==num) {
			System.out.println("Yepee, you got the number!!!");
			break;
		}else {
			throw new WrongNumberException("Oops, you lost one attempt, pls reenter!!!");
		}
		
	}catch(WrongNumberException e) {
		System.out.println(e.getMessage());
	}
	}
	
}
}
