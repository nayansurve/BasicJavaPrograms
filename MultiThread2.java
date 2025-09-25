import java.io.*;
import java.lang.*;

class MultiThread2
{

public static void main(String args[])
{
   
Thread Plandrome1=new Plandrome1();
Thread PrintPrime=new PrintPrime();

Plandrome1.start();
PrintPrime.start();

}
}
