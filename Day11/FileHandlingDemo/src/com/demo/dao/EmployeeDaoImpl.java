package com.demo.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	static List<Employee> elist;
	{
		elist=new ArrayList<>();
	}
 
	@Override
	public void readDataFromFile() {
		try(BufferedReader bis=new BufferedReader(new FileReader("empdata.txt")); ) {
			String str=bis.readLine();
			while(str!=null) {
				String[] strarr=str.split(",");
				Employee e=new Employee(Integer.parseInt(strarr[0]),strarr[1],strarr[2]);
				elist.add(e);
				str=bis.readLine();
			}
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("size: "+elist.size());
		
	}

	@Override
	public void save(Employee e) {
		elist.add(e);
		
		
	}

	@Override
	public List<Employee> findAll() {
		return elist;
	}

	@Override
	public boolean removeById(int eid) {
		return elist.remove(new Employee(eid,null,null));
	}

	@Override
	public void writeDataToFile() {
		
		try(BufferedWriter bos=new BufferedWriter(new FileWriter("empdata.txt"));) {
			
			
			for(Employee e:elist) {
				System.out.println(e);
				bos.write(e.getEid()+","+e.getEname()+","+e.getMobile()+"\n");
			   
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
