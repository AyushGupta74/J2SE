package com.demo.test;

import com.demo.beans.Class2;
import com.demo.beans.MyClass;
import com.demo.interfaces.Interface1;

public class TestInterface {
  public static void main(String[] args) {
	MyClass ob=new MyClass();
	ob.f11();
	ob.f21();
	System.out.println(Interface1.i);
	Class2 c2=new Class2();
	c2.display();
	
}
}
