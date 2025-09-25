//program to calculate addition of odd digit

import java.util.*;

class OddDigit
{
public static void main(String args[])
{
int n,sum=0,rem=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number=");
n=sc.nextInt();

while(n>0)
{
if(n%2 !=0)
{
 rem=n%10;
 sum=sum+rem;

}
 n=n/10;
System.out.println("sum of odd digits are="+sum);
}

}
}