package com.kewal.p1;
public class A{
	private int a=10;
			int b=20;
	protected int c=30;
	public int d=40;
	
	public void showA(){
		System.out.println("class A---->>Show");
		System.out.println("Private"+a);
		System.out.println("Default"+b);
		System.out.println("Protected"+c);
		System.out.println("Public"+d);
		
		A refa=new A();
		System.out.println("class A---->>Creating refVar");
		System.out.println("Private"+refa.a);
		System.out.println("Default"+refa.b);
		System.out.println("Protected"+refa.c);
		System.out.println("Public"+refa.d);
		
		System.out.println("class A---->>Using this keyword");
		System.out.println("Private"+this.a);
		System.out.println("Default"+this.b);
		System.out.println("Protected"+this.c);
		System.out.println("Public"+this.d);
	}
}