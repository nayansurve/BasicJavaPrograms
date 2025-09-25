//calling or importing pacakges

import java.io.*;
import java.lang.*;
import Pack1.*;

public class ImpPack
{
public static void main(String args[])
{
ArithOp obj=new ArithOp();

System.out.println("Addition ="+obj.add(10,20));

System.out.println("Multiplication ="+obj.mul(10,2));

}
}