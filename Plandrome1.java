//write a program using multiple thread one thread to print prime numbers and another to print palindrome numbers from 1 to 100

import java.io.*;
import java.lang.*;

class Plandrome1 extends Thread
{
  synchronized public void run()
 { 
   int n=1;
   int n1=n;  
    System.out.println("following are palindrome numbers ");

   while(n1<=100)
  {  
       
       int rev=0,rem;
       
   while(n1>0)
   { 
      
       rem=n1%10;
      rev=rev*10+rem;
      n1=n1/10;
   }
if(rev==n)
{
 System.out.println(n +" ");
}

n++;
}
}
}

   