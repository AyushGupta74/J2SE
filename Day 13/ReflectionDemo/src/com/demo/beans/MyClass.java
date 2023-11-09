package com.demo.beans;

public class MyClass {
	private int id;
	private String name;
	static int cnt;
	public MyClass() {
		super();
	}
	public MyClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getCnt() {
		return cnt;
	}
	public static void setCnt(int cnt) {
		MyClass.cnt = cnt;
	}
	@Override
	public String toString() {
		return "MyClass [id=" + id + ", name=" + name + "]";
	}
	public static void mystaticmethod() {
		System.out.println("in mystatic method");
		
	}
	public void method2() {
		System.out.println("in method2");
		
	}
	public void method1(int i) {
		System.out.println("in method1 "+i);
	}
	
	

}
