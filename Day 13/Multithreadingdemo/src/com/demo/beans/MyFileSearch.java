package com.demo.beans;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileSearch {
	public boolean searchWord(String fname,String word) {
		try(BufferedReader br=new BufferedReader(new FileReader(fname));){
			String str=br.readLine();
			while(str!=null) {
				if(str.equals(word)) {
					return true;
				}
				str=br.readLine();
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} 
		return false;
	}

}
