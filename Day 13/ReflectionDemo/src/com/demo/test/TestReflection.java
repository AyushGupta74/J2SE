package com.demo.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.demo.beans.MyClass;

public class TestReflection {

	public static void main(String[] args) {
		MyClass ob=new MyClass();
		Class cls=ob.getClass();
		Field[] flist=cls.getDeclaredFields();
		for(Field f:flist) {
			System.out.println("Name : "+f.getName()+"---Modifier : "+f.getModifiers());
		}
		//it will give access to private members
		flist[0].setAccessible(true);
		System.out.println(ob);
		try {
			flist[0].setInt(ob, 20);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ob);
		//to find method names
		Method[] mlist=cls.getMethods();
		for(Method m:mlist) {
			System.out.println(m.getName());
		}
		
		try {
			Method m=cls.getDeclaredMethod("method1", int.class);
			m.invoke(ob, 56);
		} catch (InvocationTargetException |NoSuchMethodException|SecurityException|IllegalAccessException|IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
		
		Constructor[] clist=cls.getConstructors();
		for(Constructor c:clist) {
			System.out.println("Name : "+c.getName()+" parameters : "+c.getParameterCount());
			
		}
		
		//static members 
		System.out.println("Using static members");
		Class cls1=MyClass.class;
		Method[] mstatic=cls1.getMethods();
		for(Method m1:mstatic) {
			// modifier for static method is 9
			if(m1.getModifiers()==9)
			   System.out.println(m1.getName()+"---"+m1.getModifiers());
		}
		
		Field[] fstatic=cls1.getDeclaredFields();
		for(Field f:fstatic) {
			// modifier for static field is 8
			if(f.getModifiers()==8)
			System.out.println(f.getName()+","+f.getModifiers());
		}
		
		Method m;
		try {
			m=cls1.getDeclaredMethod("mystaticmethod");
			try {
				m.invoke(MyClass.class);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
