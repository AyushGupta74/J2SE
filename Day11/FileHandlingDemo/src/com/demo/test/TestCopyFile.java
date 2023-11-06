package com.demo.test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopyFile {

	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			fis=new FileInputStream("testfile.txt");
			fos=new FileOutputStream("testcopy.txt");
			int x=fis.read();
			while(x!=-1) {
			    fos.write(x);
			    x=fis.read();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("error occured");
		} catch (IOException e) {
			System.out.println("i/o error");
		}finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	

	}

}
