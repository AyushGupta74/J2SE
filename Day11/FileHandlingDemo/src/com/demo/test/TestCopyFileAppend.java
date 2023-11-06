package com.demo.test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopyFileAppend {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		File f=new File("testcopy.txt");
		 try {
			if(f.exists()) {
				
					fos=new FileOutputStream("testcopy.txt",true);
				
			}else {
				 fos=new FileOutputStream("testcopy.txt");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try (FileInputStream fis=new FileInputStream("testfile.txt");
			FileOutputStream fos1=fos;){
			int x=fis.read();
			while(x!=-1) {
			    fos1.write(x);
			    x=fis.read();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("error occured");
		} catch (IOException e) {
			System.out.println("i/o error");
		}
	

	}

}
