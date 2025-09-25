//find the first and second largest number using array

import java.util.*;

class LargestNumber
{
public static void main(String args[])
{
int i,large,seclarge;
int arr[]=new int[5]; 
Scanner sc=new Scanner(System.in);
System.out.println("Enter five elements =");
for(i=0;i<5;i++)
{
arr[i]=sc.nextInt();
}
large=arr[0];
seclarge=arr[0];

for(i=0;i<5;i++)
{
 if(arr[i]>large)
{
  large=arr[i];
}
else if(arr[i]>seclarge)
{
  seclarge=arr[i];
}
}
for(i=0;i<5;i++)
{
  if(arr[i]<large && arr[i]>seclarge)
{
   seclarge=arr[i];
}
}
System.out.println("largest element is ="+large);
System.out.println("Second largest element is ="+seclarge);
}
}


