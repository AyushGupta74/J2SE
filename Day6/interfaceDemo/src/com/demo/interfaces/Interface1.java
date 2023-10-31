package com.demo.interfaces;


public interface Interface1 {
    int i=23;
    void f11();
    //it is added in 1.8
    default void f21() {
    	System.out.println("in function f2");
    }
    //it is added in 1.8
    public static void f31() {
    	System.out.println("in static methods");
    }
}
