class lab{
	public static void main(String...args){
		A a=new A();
		a.method(10);
		a.method(10,20);
		a.method(10,20,30);
		a.method(10,20,30,40);
	}
}
class A{
	void method(int a){
		System.out.println("m1");
	}
	void method(int a,int b){
		System.out.println("m2");
	}
	void method(int a,int b,int c){
		System.out.println("m3");
	}
	void method(int a,int b,int c,int d){
		System.out.println("m4");
	}
}