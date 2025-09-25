//entered number is composite number or not

import java.util.*;

class Composite
{
public static void main(String args[])
{
int n,i=2;
boolean flag=false;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number =");
n=sc.nextInt();

for(i=2;i<n;i++)
{
if(n%i==0 || n%3==0)
{
flag=true;
break;
}
i=i+1;
}
if(flag == true)
{
 System.out.println(n +" is composite number");
}
else
{
System.out.println(n +" Is not composite number");
}
}
}

