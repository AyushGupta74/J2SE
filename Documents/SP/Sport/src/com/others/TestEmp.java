package com.others;

import java.time.LocalDate;

public class TestEmp {

	public static void main(String[] args) {
		
		Employee e=new Employee(12,"xxx","3333","asd@gmail.com","Hr",LocalDate.of(2001,11,23),"mgr");
        System.out.println(e);
        SalariedEmployee semp=new SalariedEmployee(12,"Rajat","4444","a@gmail.com","hr",LocalDate.of(2002, 12,30),"associate",4556,345);
		System.out.println(semp);
		ContractEmployee cemp=new ContractEmployee(12,"Rajat","4444","a@gmail.com","hr",LocalDate.of(2002, 12,30),"associate",30,4000);
		Employee e1=new SalariedEmployee(12,"Rajat","4444","a@gmail.com","hr",LocalDate.of(2002, 12,30),"associate",4556,345);
		((SalariedEmployee)e1).getBonus();
		Person p=new SalariedEmployee(12,"Rajat","4444","a@gmail.com","hr",LocalDate.of(2002, 12,30),"associate",4556,345);
		System.out.println(cemp);
		System.out.println(p);
		SalariedEmployee s=(SalariedEmployee)e1;
		System.out.println(s);
	}

}
