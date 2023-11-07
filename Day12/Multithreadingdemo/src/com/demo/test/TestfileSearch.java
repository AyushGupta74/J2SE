package com.demo.test;

import java.util.Scanner;

import com.demo.beans.MyFileSearch;
import com.demo.thread.SearchThread;

public class TestfileSearch {

	public static void main(String[] args) {
		MyFileSearch ob=new MyFileSearch();
		SearchThread[] tharr=new SearchThread[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("enetr new string");
			String search=sc.next();
			tharr[i]=new SearchThread(search,ob,"mywords.txt");
			tharr[i].start();
		}
		
		for(int i=0;i<5;i++) {
			try {
				tharr[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
