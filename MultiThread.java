//multithread


import java.io.*;
import java.lang.*;

class MultiThread
{
public static void main(String args[])
{
   Table t1=new Table();

   MyThread1 m1=new MyThread1(t1);

   MyThread2 m2=new MyThread2(t1);

m1.start();
m2.start();
}
}

 