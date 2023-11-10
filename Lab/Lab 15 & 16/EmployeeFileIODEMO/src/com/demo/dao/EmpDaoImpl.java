package com.demo.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.demo.beans.Employee;

public class EmpDaoImpl implements EmpDao {
	static ArrayList<Employee> eList;
	static {
		eList = new ArrayList<>();
	}

	@Override
	public void ReadFile() {
//		try (BufferedReader bis = new BufferedReader(new FileReader("empdata.txt"));) {
//			String str = bis.readLine();
//			while (str != null) {
//				String strarr[] = str.split(",");
//				Employee e = new Employee(Integer.parseInt(strarr[0]), strarr[1], strarr[2]);
//				eList.add(e);
//				str = bis.readLine();
//			}
//		} catch (IOException e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//		}
//		System.out.println("Size: " + eList.size());

		// serialization

		File f = new File("empdata.txt");
		if (f.exists()) {
			try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("empdata.txt"));) {

				while (true) {
					Employee e = (Employee) ois.readObject();
					eList.add(e);
				}

			} catch (EOFException e) {
				System.out.println("End of file...");
			} catch (IOException | ClassNotFoundException e) {
				System.out.println(e.getMessage());
			}
		}

	}

	@Override
	public void writeAll() {
//		try (BufferedWriter bos = new BufferedWriter(new FileWriter("empdata.txt"));) {
//			for (Employee e : eList) {
//				System.out.println(e);
//				bos.write(e.getEid() + "," + e.getEname() + "," + e.getMob() + "\n");
//			}
//		} catch (IOException e) {
//			System.out.println(e.getMessage());
//		}

		// deserialization

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("empdata.txt"));) {
			for (Employee e : eList) {
				oos.writeObject(e);
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	@Override
	public void save(Employee e) {
		eList.add(e);
	}

	@Override
	public ArrayList<Employee> getAll() {
		return eList;
	}

	@Override
	public boolean delete(int id3) {
		return eList.remove(new Employee(id3, null, null));
	}

}
