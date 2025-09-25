//inputmismatchexception

import java.io.*;
import java.lang.*;
import java.util.*;


public class Inputmismatch
{
	public static void main(String args[])
	{
	int a,b;
	while(true)
	try
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of a and b");
	a=sc.nextInt();
	b=sc.nextInt();
	System.out.println("Addition ="+(a+b));
	break;
}
catch(InputMismatchException e)
{
	System.out.println(e);
}

}
}