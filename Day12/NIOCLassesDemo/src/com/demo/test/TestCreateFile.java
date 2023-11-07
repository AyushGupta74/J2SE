package com.demo.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestCreateFile {
	public static void main(String[] args) {
		
		try {
			Path p=Paths.get("./testfile.txt");
			Files.createFile(p);
			Files.write(p, "this is testing".getBytes());
			System.out.println("you create testfile");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
