package com.demo.test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopyFile2 {

	public static void main(String[] args) {
		
		
		try(FileInputStream  fis=new FileInputStream("testfile.txt");
			FileOutputStream fos=new FileOutputStream("testcopy.txt");) {
			
			int x=fis.read();
			while(x!=-1) {
			    fos.write(x);
			    x=fis.read();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("error occured");
		} catch (IOException e) {
			System.out.println("i/o error");
		}
	

	}

}
