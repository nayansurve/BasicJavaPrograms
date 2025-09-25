//addAll method

import java.util.*;

class ArrayListeg3
{
public static void main(String args[])
{
ArrayList<String>al=new ArrayList<String>();

al.add("sarthak");
al.add("nirjala");
al.add("naina");

ArrayList<String>al2=new ArrayList<String>();

al2.add("mul");
al2.add("sona");

al.addAll(al2);

Iterator itr=al.iterator();

while(itr.hasNext())
{
 System.out.println(itr.next());
}
}
}
  