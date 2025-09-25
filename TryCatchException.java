//arithmetic exception

import java.io.*;
import java.lang.*;

public class TryCatchException
{
public static void main(String args[])
{
try
{
int n=10/0;
}
catch(ArithmeticException e)
{
 System.out.println(e);
}
System.out.println("rest of code");
}
}