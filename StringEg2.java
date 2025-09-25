//count the number of vowels,consonent and space in string

import java.io.*;
import java.lang.*;

class StringEg2
{
public static void main(String args[])
{
int counts=0, countv=0,countc=0,i=0;
String str=" nayan";
//char c[]=str.toCharArray();
                       
System.out.println("total count of vowels,consent and spcae in string is=");
while(i<str.length())
{
 if(str.charAt(i)==' ')
{
   counts=counts+1;
}
else if(str.charAt(i)=='a' ||str.charAt(i)=='e' || str.charAt(i)=='i'
 || str.charAt(i)=='o' || str.charAt(i)=='u')
{
   countv=countv+1;
}
else
{  
 countc=countc+1;
}
i=i+1;
}
System.out.println("space count is="+counts);
System.out.println("vowel count is="+countv);
System.out.println("consonent count is="+countc);
}
}
