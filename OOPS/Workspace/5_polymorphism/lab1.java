class person{
	void running(){
		System.out.println("Person--->Running");
	}
	void eating(){
		System.out.println("Person--->eating");
	}
	static void sleeping(){
		System.out.println("Person--->sleeping");
	}
}
class student extends person{
	void running(){
		System.out.println("Student--->Running");
	}
	void reading(){
		System.out.println("Student--->reading");
	}
	static void sleeping(){
		System.out.println("Student--->sleeping");
	}
}
class employee extends person{
	void running(){
		System.out.println("employee--->Running");
	}
	void working(){
		System.out.println("employee--->working");
	}
	static void sleeping(){
		System.out.println("employee--->sleeping");
	}
}
public class lab1{
	public static void main(String []args){
		person p=null;
		p=new student();
		p.running();
		p.sleeping();
		p.eating();
		student ref1=(student)p;
		ref1.reading();
		
		p=new employee();
		p.running();
		p.sleeping();
		p.eating();
		employee ref=(employee)p;
		ref.working();
		
		student rt=new student();
		rt.eating();
	}
}