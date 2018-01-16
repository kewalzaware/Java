class memallo{
public static void main(String []args){
	System.out.println("Main>>Starts");
	Student st=new Student();
	st.display();
		System.out.println("Main>>Ends");
	
}
}


class Student{
	void display(){
		System.out.println("Student----->>Display>>Starts");
		new A().m1();
		System.out.println("Student----->>Display>>Ends");
	}
}
class A{
	
	void m1(){
		System.out.println("M1>>Starts");
		new B().m2();
		System.out.println("M1>>Ends");
	}
}
class B{
	void m2(){
		System.out.println("M2>>Starts");
		new C().m3();
		System.out.println("M2>>Ends");
	}
}
class C{
	
	void m3(){
		System.out.println("M3>>Starts");
		System.out.println("M3>>Ends");
	}
}