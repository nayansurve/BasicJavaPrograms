//java program to add the sum of the given number 

import java.util.*;

class SumDigit
{
public static void main(String args[])
{
int n,sum=0,rem=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number =");
n=sc.nextInt();

while(n>0)

{
rem=n%10;
sum=sum+rem;
n=n/10;
}
System.out.println("sum of digits="+sum);
}
}