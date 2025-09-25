//program to check whether the given number is divisible by 5 or 11 or not

import java.util.*;

class Number
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number =");
n=sc.nextInt();

if(n%5==0 && n%11==0)
{
  System.out.println("number is divisible by both");
}
else if(n%11==0)
{
  System.out.println("Number is divisible by 11");
}
else if(n%5==0)
{
  System.out.println("number is divisible by 5");
}
else
{
  System.out.println("number is not valid");
}
}
}



