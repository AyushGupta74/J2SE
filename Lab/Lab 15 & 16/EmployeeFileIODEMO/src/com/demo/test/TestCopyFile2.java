package com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopyFile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileInputStream fis = new FileInputStream("textfile.txt");
				FileOutputStream fos = new FileOutputStream("textcopy.txt");) {
			int x = fis.read();
			while (x != -1) {
				fos.write(x);
				x = fis.read();
			}
			System.out.println("Data writed successfully..!");
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println(e.getMessage() + "\n IO ERROR");
		}
	}

}
