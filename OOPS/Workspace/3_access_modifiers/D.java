package com.kewal.p2;
import com.kewal.p1.*;
public class D extends A{
	
	public void showD(){
		System.out.println("class D---->>Show");
		//System.out.println("Private"+a);
		//System.out.println("Default"+b);
		System.out.println("Protected"+c);
		System.out.println("Public"+d);
		
		A refa=new A();
		System.out.println("class D---->>Creating super class refVar");
		//System.out.println("Private"+refa.a);
		//System.out.println("Default"+refa.b);
		//System.out.println("Protected"+refa.c);
		System.out.println("Public"+refa.d);
		
		D refb=new D();
		System.out.println("class D---->>Creating current class refVar");
		//System.out.println("Private"+refa.a);
		//System.out.println("Default"+refb.b);
		System.out.println("Protected"+refb.c);
		System.out.println("Public"+refb.d);
		
		System.out.println("class D---->>Using this keyword");
		//System.out.println("Private"+this.a);
		//System.out.println("Default"+this.b);
		System.out.println("Protected"+this.c);
		System.out.println("Public"+this.d);
		
		System.out.println("class D---->>Using super keyword");
		//System.out.println("Private"+this.a);
		//System.out.println("Default"+super.b);
		System.out.println("Protected"+super.c);
		System.out.println("Public"+super.d);
	}
}