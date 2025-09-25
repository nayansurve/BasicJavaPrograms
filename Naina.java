//throwsexception

import java.io.*;
import java.lang.*;

public class Naina
{
	static void validate(int age)
	{
	 if(age < 18)
	 throw new ArithmeticException("not eligible to vote");
	 else
	 System.out.println("welcome to vote");
}
public static void main(String args[])
{
	validate(16);
	System.out.println("rest of code");
}
}