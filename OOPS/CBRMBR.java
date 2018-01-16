class CBRMBR{
public static void main(String...args){
Hello h1=new Hello();
	}
}
class Hello{
	int a=99;
	static int b=88;
	{
		System.out.println("Hello IB");
	}
	static{
		System.out.println("Hello SB");
	}
	Hello(){
		System.out.println("Hello DC");
	}
}