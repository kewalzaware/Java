class method3{
	
	public static void main(String args[]){
		
	student s=new student();	
	student s1=new student();
	student s2=new student(10,20);
	
	
	int a=s.dude(0,20);
	System.out.println(a);
	//student s4=null;
	//student.dude();
	}
}
class student{
	
	int a;
	int b;
	static int c;
	
	static{
		
		System.out.println("Its Static block");
	}
	{
		System.out.println("Its instance block");
	}
	 student(int a,int b){
		this.a=a;
		this.b=b;
		int res=a+b;
		System.out.println("Its Static constructor:"+res);
	}
	student(){
		System.out.println("Its Instance Constructor");
	
	}
	
	int dude(int x,int y){
		int res=x+y;
		System.out.println("Dude Method");
	return res;
	}
}