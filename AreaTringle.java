//java program to calculate area of tringle

import java.util.*;

class AreaTringle

{
 public static void main(String args[])
{

float b,h,area;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a base and height of tringle");
b=sc.nextFloat();
h=sc.nextFloat();


area=(b*h)/2;

System.out.println("area of tringle is ="+area);
}
}


