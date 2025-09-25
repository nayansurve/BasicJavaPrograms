//Program to swapping two numbers without using third variable

import java.util.*;

class SwapNum

{
  public static void main(String args[])
{
  int a,b;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number :");
  a=sc.nextInt();
  b=sc.nextInt();

  System.out.println("the numbers before swapping are :-");
  System.out.println(" a= "+ a+ "  b= "+b);

  a=a+b;
  b=a-b;
  a=a-b;

 System.out.println("the numbers after swapping are:-");
 System.out.println(" a= "+a+" b= "+b);
}
}



 


  