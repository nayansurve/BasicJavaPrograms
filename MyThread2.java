import java.io.*;
import java.lang.*;

class MyThread2 extends Thread
{
   Table t=new Table();
   MyThread2(Table t)
{
    this.t=t;
}
   public void run()
{
   t.printTable(20);
}
}