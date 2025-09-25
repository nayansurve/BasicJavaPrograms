//Iterator

import java.util.*;

class ArrayListeg2
{
public static void main(String args[])
{
ArrayList<String> al=new ArrayList<String>();

al.add("sarthak");
al.add("nirjala");
al.add("naina");
al.add("akku");

Iterator itr=al.iterator();

while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}