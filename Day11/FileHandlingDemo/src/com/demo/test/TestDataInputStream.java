package com.demo.test;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Stream;

import com.demo.beans.Employee;

public class TestDataInputStream {

	public static void main(String[] args) {
		try(DataInputStream dis=new DataInputStream(new FileInputStream("empdata.csv"))){
			ArrayList<Employee> elist=new ArrayList<>();
			String str=dis.readLine();
			while(str!=null) {
			   System.out.println(str);
			    String[] strarr=str.split(",");
			    Stream.of(strarr).forEach(System.out::println);
			    elist.add(new Employee(Integer.parseInt(strarr[0]),strarr[1],strarr[2]));
			    str=dis.readLine();
			}
			System.out.println(elist);
		}catch(IOException e ) {
			
		}

	}

}
