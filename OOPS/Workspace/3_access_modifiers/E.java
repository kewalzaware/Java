package com.kewal.p2;
import com.kewal.p1.*;
public class E{
	
	public void showE(){
		System.out.println("class E---->>Show");
		A ab=new A();
		//System.out.println("Private"+a);
		//System.out.println("Default"+b);
		//System.out.println("Protected"+c);
		System.out.println("Public"+ab.d);
	}
}