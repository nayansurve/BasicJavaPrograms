//Program to find the simple interest

import java.util.*;

class SimpleInterst

{
  public static void main(String args[])
{
  
double p,t,r,si,total;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a amount");

p=sc.nextDouble();

System.out.println(" no of year");

t=sc.nextDouble();

System.out.println("rate of interest=");

r=sc.nextDouble();



si=(p*t*r)/100;
total=p+si;

System.out.println("amount is=" +p);
System.out.println("no of years=" +t);
System.out.println("rate of interest ="+r);

System.out.println("simple interest ="+si);
System.out.println("total amont ="+total);
}
}


