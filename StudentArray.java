//java program to print student rollno,name and marks for five students

import java.util.*;

class StudentArray
{
public static void main(String args[])
{
int roll_no[]=new int[5];
String name[]=new String[5];
float mks[]=new float[5];

Scanner sc=new Scanner(System.in);
System.out.println("Enter student roll number,name and marks : - ");

for(int i=0;i<5;i++)
{
roll_no[i]=sc.nextInt();
name[i]=sc.next();
mks[i]=sc.nextFloat();
}
System.out.println("Student Details = ");
for(int i=0;i<5;i++)
{
System.out.println( roll_no[i]+"\t"+name[i]+"\t"+mks[i]);
}
}
}
 