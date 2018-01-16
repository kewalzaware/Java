class Lab1{
 public static void main(String args[]){

int a=5;
int i;
int j;
for(i=1;i<=a;i++){

for(j=i;j>1;j--){


System.out.print("");
}
for(int k=1;k<=a-(i-1);k++){
System.out.print("*");
for(int k1=1;k1<k;k1+=k){

System.out.print("*");}
}
System.out.println();
}


}

}