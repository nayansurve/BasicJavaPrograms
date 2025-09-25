import java.io.*;
import java.lang.*;

class PrintPrime extends Thread
{
   public void run()
{
   int n=1,i;
   boolean flag;
  
 System.out.println("Prime number from 1 to 100");

  while(n<=100)
{
  i=2;
flag=false;

while(i<n)
{
  if(n%i==0)
  {
   flag=true;
    break;
  }
i=i+1;
}
if(flag==false)
{

System.out.println(n);

}
n=n+1;
}
}
}