//program to write arithmetic operations

import java.util.*;

class Arithmetic
{
public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("enter the values of a and b=");
a=sc.nextInt();
b=sc.nextInt();

System.out.println("Addition="+(a+b));
System.out.println("Substraction="+(a-b));
System.out.println("Multiplication="+(a*b));
System.out.println("Division="+(a/b));
System.out.println("Modules="+(a%b));
}
}

