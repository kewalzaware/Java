class ATRI
{
public static void main(String[] args) 
{
int i,j,k;
int n=10;

for(i=1; i<=n; i++)
{
for(j=(n-1); j>=i; j--)
{
System.out.print(" ");
}
for(k=1; k<=(2*i-1); k++)
{

System.out.print("+");


}
System.out.println("");
}
}
}