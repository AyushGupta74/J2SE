package com.demo.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyfileDemo {
  public static void main(String[] args) {
	  try {
	 Path p=Paths.get("./testfile.txt");
	 Path p1=Paths.get("./testcopy.txt");
	 Files.copy(p, p1);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
