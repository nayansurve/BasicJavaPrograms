//ArrayIndexOutOfBoundsException
import java.io.*;
import java.lang.*;

public class Exception3
{
	public static void main(String args[])
	{
	  try
	  {
	    int a[]=new int[5];
	    a[10]=30;
	  }
	  catch(ArithmeticException e)
	  {
	    System.out.println(e+"task 1 done");
	  }
	  catch(ArrayIndexOutOfBoundsException e)
	  {
	    System.out.println(e+"exception occur");
	  }
	  catch(Exception e)
	  {
	  	System.out.println("common task completed");
	  }
	                    
	  System.out.println("rest  of code ");
	}
}