class thiskey{

public static void main(String args[]){
student st1=new student(11,22);
//student st2=new student(11,22,33);
//student st3=new student(11,22,33,44);
st1.show();
//st2.show();
//st3.show();
}
}
class student{
int a;
int b;
int c;
int d;
student(int a,int b){
//this();
//this(int a,int b,int c);
//this(int a,int b,int c,int d);
this.a=a;
this.b=b;

}
student(int a,int b,int c){
this.a=a;
this.b=b;
this.c=c;
}
student(int a,int b,int c,int d){
this.a=a;
this.b=b;
this.c=c;
this.d=d;
}
void show(){
System.out.println("\nValue of A:"+a+"\nValue of B:"+b+"\nValue of C:"+c+"\nValue of D:"+d);

}

}