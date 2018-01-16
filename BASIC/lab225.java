class lab225{

 public static void main(String args[]){
Student st1=new Student(11,22,"aaaa","aaaa",32654651);
Student st2=new Student(33,44,"bbbbbbbb","bbbbb");
Student st3=new Student(55,66,"cccc");
Student st4=new Student(77,88);
Student st5=new Student(99);

st1.show();
st2.show();
st3.show();
st4.show();
st5.show();
}
}
class Student{

int UID;
int JID;
String CLG;
String NAME;
long PHONE;

Student(int a,int b,String c,String d,long e){
System.out.println("****CONST 5 STARTED*******");
UID=a;
JID=b;
CLG=c;
NAME=d;
PHONE=e;
}

Student(int a,int b,String c,String d){
System.out.println("****CONST 4 STARTED*******");
UID=a;
JID=b;
CLG=c;
NAME=d;

}
Student(int a,int b,String c){
System.out.println("****CONST 3 STARTED*******");
UID=a;
JID=b;
CLG=c;

}
Student(int a,int b){
System.out.println("****CONST 2 STARTED*******");
UID=a;
JID=b;

}
Student(int a){
System.out.println("****CONST 1 STARTED*******");
UID=a;

}

void show(){
System.out.println("\n****SHOW STARTED*******");
System.out.println("\nUID"+UID+"\nJID"+JID+"\nCLG"+CLG+"\nNAME"+NAME+"\nPHONE"+PHONE);

}

}