import java.util.*;
class Twin
{
public static void main (string args [])
{
int n1,N2,i,j;
System.out.println("enter two numbers");
Scanner r=new Scanner(System.in);
n1=r.nextInt();
n2=r.nextInt();
for(i=n1;i<=n2;i++)
{
for(j=2;j<=i;j++)
{
if(i%j==0)
break;
}
if(i==j)
System.out.println(j+" ");
}
}
}
