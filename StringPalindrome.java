//check if the given string is palindrome or not

import java.io.*;
import java.lang.*;
import java.util.*;

class StringPalindrome
{
public static void main(String args[])
{
String str;
Scanner sc=new Scanner(System.in);
System.out.print("enter a string=");
str=sc.nextLine();

StringBuffer s1=new StringBuffer(str);
StringBuffer s2=new StringBuffer(s1);

s1.reverse();

System.out.println("given string is="+s2);
System.out.println("reverse of string is="+s1);

if(String.valueOf(s1).compareTo(String.valueOf(s2))==0)
{
System.out.println(s2+" is a palindrome");
}
else
{
System.out.println(s2+" is not a palindrome");
}
}
}
