package com.demo.test;

import com.demo.beans.AccessModifiers;
import com.demo.beans.ChildOfAccessModifier;

public class TestAccessModifiers {

	public static void main(String[] args) 
	{
		AccessModifiers ac = new AccessModifiers();
		
		System.out.println(ac.id);
		//System.out.println(ac.name);  private methods so not accesible
		//System.out.println(ac.email);
		
		ChildOfAccessModifier c1= new ChildOfAccessModifier();
		c1.display();
		
		
	}

}
