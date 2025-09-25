//entered number is special number or not

import java.util.*;
{
class SpecialNumber
{
public static void main(String args [])
{
int i,n1,n,fact=1,sum=0,rem=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a original number =");
n=sc.nextInt();

for(i=0;i<=n;i++)
{
 rem=n%10;
for(i=0;i<=n;i++)
{
fact=fact*rem;
rem=rem-1;
}
sum=sum+fact;
rem=rem-1;
}
sum=sum+fact;
n=n/10;
}
if(sum==n1)
{
System.out.println(n1+"is a special number");
}
else
{
System.out.println(n1+is a original number");
}
}
}
}




