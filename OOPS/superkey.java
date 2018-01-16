class superkey{
	public static void main(String...args){
		B ref=new B(30);
		ref.show();
	}
}
class A{
	static int a=10;
	void asd(){
		System.out.println("Hello");
		}
		A(int a){
			System.out.println(a);
		}
}
class B extends A{
	static int a=20;
	B(int a){
		super(a);
	}
	void show(){
		super.asd();
		int a=30;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}