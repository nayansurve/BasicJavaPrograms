//generate the fibonaccie series using for loop
import java.util.*;

class Fibonacci
{
public static void main(String args[])
{
 long,i,n,n1=0,n2=1,n3;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number =");
n=sc.nextLong();
System.out.print(n1 +" ");
System.out.print(n2 +" ");

for(i=2;i<=n;i++)
{
n3=n1+n2;
System.out.print(n3 +" ");
n1=n2;
n2=n3;
}
}
}