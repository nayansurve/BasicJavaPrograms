//program to input angles of a triangle and check whether triangle is valid or not

import java.util.*;

class Triangle
{
 public static void main(String args[])
{
  int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enterd the value of a,b,and c");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();

if((a+b+c)==180)
{
System.out.println("triangle is valid");
}
else
{
System.out.println("triangle is not valid");

}
}
}