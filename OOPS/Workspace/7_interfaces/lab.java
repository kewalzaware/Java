interface I1{
	int a=0;
	void show();
}
interface I2{
	int a=1;
	void show();
	class A{
		int a=1;
		void Show(){
			System.out.println(a);
		}
	} 
	
	A q=new A();
String b=q;
	
	}
class A implements I1,I2{
	public void show(){
		System.out.println(I2.a);
		System.out.println(I1.a);
		System.out.println(I2.b);
	
	}
}
class lab{
	public static void main(String...args){
		System.out.println("Main");
		A a=new A();
		a.show();
		//I2.q.show();
	}
}