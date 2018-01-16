package com.kewal.p1;
public class B extends A{
	
	public void showB(){
		System.out.println("class B---->>Show");
		//System.out.println("Private"+a);
		System.out.println("Default"+b);
		System.out.println("Protected"+c);
		System.out.println("Public"+d);
		
		A refa=new A();
		System.out.println("class B---->>Creating super class refVar");
		//System.out.println("Private"+refa.a);
		System.out.println("Default"+refa.b);
		System.out.println("Protected"+refa.c);
		System.out.println("Public"+refa.d);
		
		B refb=new B();
		System.out.println("class B---->>Creating current class refVar");
		//System.out.println("Private"+refa.a);
		System.out.println("Default"+refb.b);
		System.out.println("Protected"+refb.c);
		System.out.println("Public"+refb.d);
		
		System.out.println("class B---->>Using this keyword");
		//System.out.println("Private"+this.a);
		System.out.println("Default"+this.b);
		System.out.println("Protected"+this.c);
		System.out.println("Public"+this.d);
		
		System.out.println("class B---->>Using super keyword");
		//System.out.println("Private"+this.a);
		System.out.println("Default"+super.b);
		System.out.println("Protected"+super.c);
		System.out.println("Public"+super.d);
	}
}