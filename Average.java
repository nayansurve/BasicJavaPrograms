//Java Program  to calculate Total and avg marks of a student for three subjects and print rollno,name, total and avg 

import java.util.*;

class Average
{
public static void main(String args[])
{
int rollno,total,avg,m1,m2,m3;
String name;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the studetnt name=");
name=sc.nextLine();
System.out.println("Enter the studetnt roll number");
rollno=sc.nextInt();
System.out.println("Enter the studetnt three subjects marks");
m1=sc.nextInt();
m2=sc.nextInt();
m3=sc.nextInt();
total=(m1+m2+m3);
avg=(total/3);

if(m1>40 && m2>40 && m3>40)
{
  if(avg>=90 && avg<=100)
{
  System.out.println("Grade A");
}
else if(avg>70 && avg <90)
{
  System.out.println("Grade B");
}
else if(avg>50 && avg<70)
{
System.out.println("Grade c");
}
else
{
System.out.println("pass");
}
}
else
{
System.out.println("fail");
}
}
}


