package com.demo.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteToFile {
	public static void main(String[] args) {
		try {
		String str="this is good task";
		Path p=Paths.get("myfile.txt");
		byte[] b=str.getBytes();
		Files.write(p,b );
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
