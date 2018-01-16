class lab{
	public static void main(String []args){
		//A a=new A();
		//B b=new B();//can not create object/instantiated of abstract classes.
		//C c=new C();// we can create object of concrete subclass and call abstract methods from direct/indirect super class.
		B c=null;    // also we can use dynamic dispatch mechanism for creating object of abstract call and assign to concrete sub class.
		c=new C();
		c.add();
		c.sub();
		c.del();
	}
}
abstract class A{
	abstract void add();      //can not use private,final,static with abstract keyword.
	abstract void sub();
	abstract void del();
}abstract class B extends A{
	void add(){
		System.out.println("add");
	}
	
}
class C extends B{
	void sub(){
		System.out.println("sub");
	}
	void del(){
		System.out.println("del");
	}
}