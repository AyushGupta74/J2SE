package com.demo.test;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBufferedInputStream {

	public static void main(String[] args) {
		    BufferedOutputStream bos=null;
		    String fname="testcopy.txt";
			File f=new File(fname);
			try {
				if(f.exists()) {
						//open the file in append mode
							bos=new BufferedOutputStream(new FileOutputStream(f,true));
				}else{
					//open the file in write mode
					bos=new BufferedOutputStream(new FileOutputStream(f));
				}
		    }catch(IOException e) {
				System.out.println(e.getMessage());
			}
			

        try(BufferedInputStream bis=new BufferedInputStream(new FileInputStream(f));
        		BufferedOutputStream bos1=bos;){
        	int x=bis.read();
        	while(x!=-1) {
        		bos.write(x);
        		x=bis.read();
        	}
        	
        } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
