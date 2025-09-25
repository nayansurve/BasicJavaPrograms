//BufferReader
import java.io.*;
import java.lang.*;

public class Bufferead
{
	public static void main(String args[])
	throws IoException
	{
	  int n1,n2;
	  InputStreamReader isr=new InputStreamReader(System.in);
	  BufferReader br=new BufferReader(isr);

	  System.out.println("enter n1 and n2");
	  n1=Integer.parseInt(br.readLine());
	  n2=Integer.parseInt(br.readLine());

	  System.out.println("Addition="+(n1+n2));
	}
}