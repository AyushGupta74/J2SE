package com.demo.test;

import java.util.Scanner;

import com.demo.exceptions.BlockedAccountException;
import com.demo.exceptions.WrongCrendentialException;
import com.demo.service.UserService;

public class TestLogin {

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		try {
		for(int i=0;i<3;i++) {
			
			try {
				System.out.println("enetr user name");
				String uname=sc.next();
				System.out.println("enetr password");
				String pass=sc.next();
				boolean status=UserService.validateUser(uname,pass);
				if(status) {
					System.out.println("success");
					
					
				}
				break;
				
			}catch(WrongCrendentialException e) {
				System.out.println("Error" + e.getMessage());
				if(i==2) {
					throw new BlockedAccountException("Your account is blocked, pls contact admin ");
				}
			}
		}
		}catch(BlockedAccountException e) {
			System.out.println(e.getMessage());
		}

	}

}
