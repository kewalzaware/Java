class lab{
public static void main(String []args){
	A b=new A();
	 b=new B();
	 b=new C();
	 b=new D();
	B a=new B();
	a=new C();
	
}
}
class A{
	public void m1(){
		System.out.println("A--->>m1()");
		}
}
class B extends A{
	public void m1(){
		System.out.println("B--->>m1()");
	
	}
}
class C extends B{}
class D extends A{}