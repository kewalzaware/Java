class lab6{

public static void main(String args[]){
System.out.println("*********STATIC*************");
int a=10;
int b=20;
int res=a+b;
System.out.println(res);
System.out.println("**********DYNAMIC***************");

if(args.length>=2){
String str1=args[0];
String str2=args[1];
System.out.println(str1+str2);
int x=Integer.parseInt(str1);
int y=Integer.parseInt(str2);
int res1=x+y;
System.out.println(res1);
}else
{System.out.println("invali/d");}

}}

