package com.demo.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFileDemo{
	public static void main(String[] args) {
		 
		try {
			Path p=Paths.get("./testfile.txt");
			 List<String> lst;
			lst = Files.readAllLines(p);
			//Files.walkFileTree(p, null);
		    System.out.println(lst);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

}
