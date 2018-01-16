package com.kewal.p1;
public class C{
	
	public void showC(){
		System.out.println("class C---->>Show");
		A a1=new A();
		//System.out.println("Private"+a1.a);
		System.out.println("Default"+a1.b);
		System.out.println("Protected"+a1.c);
		System.out.println("Public"+a1.d);
	}
}