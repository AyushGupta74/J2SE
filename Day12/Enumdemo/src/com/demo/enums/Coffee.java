package com.demo.enums;

public enum Coffee {
	small(150,150),medium(200,200),big(300,350);
    private int size;
    private float price;
	private Coffee(int s, float p) {
		System.out.println("in coffe coonstructor");
		size=s;
		price=p;
		
	}
	public int getSize() {
		return size;
	}
	
	public float getPrice() {
		return price;
	}
	

}
