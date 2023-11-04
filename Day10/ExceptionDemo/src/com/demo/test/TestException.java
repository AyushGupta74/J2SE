package com.demo.test;
import java.util.Scanner;

public class TestException {
	private static int divide(int num1, int num2) {
		try {
			int ans=(int)(num1/num2);
			return ans;
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			throw e;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			//open file
			//read file
			String str="Hello";
			System.out.println("enetr number 1");
			int num1=sc.nextInt();
			System.out.println("enetr number 2");
			int num2=sc.nextInt();
			int ans=divide(num1,num2);
			System.out.println("Answer division : "+ans);
			
			System.out.println("String : "+str);
			System.out.println("Length : "+str.length());
			System.out.println("after displaying length");
			
		}catch(NullPointerException e) {
			System.out.println("String is null");
			System.out.println(e.getMessage());
		}catch(ArithmeticException e) {
			System.out.println("in arithmetic exception : "+e.getMessage());
		}catch(Exception e) {
			System.out.println("error occured : "+e.getMessage());
		}finally {
			System.out.println("in finally block");
			//file close;
		}

	}

	

}
