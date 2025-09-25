//revrese number

import java.util.*;

class RevNum
{
public static void main(String args[])
{
int n,rev=0,rem=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
n=sc.nextInt();

while(n>0)
{
 rem=n%10;//54
 rev=rev*10+rem;//4
 n=n/10;//5
}
System.out.println("Reverse number is ="+rev);
}
}
