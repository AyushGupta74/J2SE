package com.demo.beans;

import com.demo.interfaces.Interface1;
import com.demo.interfaces.Interface2;

public class MyClass implements Interface1,Interface2{

	@Override
	public int f12() {
		System.out.println("In f12");
		return 0;
	}

	@Override
	public void f22() {
		System.out.println("In f22");
		
	}

	@Override
	public void f11() {
		System.out.println("In f11");
		
	}

	@Override
	public void f21() {
		// TODO Auto-generated method stub
		Interface1.super.f21();
		Interface2.super.f21();
		System.out.println("extra code for default method");
	}

}
