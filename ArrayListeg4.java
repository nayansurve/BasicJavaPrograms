//removeAll()

import java.util.*;

public class ArrayListeg4
{
public static void main(String args[])
{
ArrayList<String>al=new ArrayList<String>();

al.add("sarthak");
al.add("Naina");
al.add("nirjala");

ArrayList<String>al2=new ArrayList<String>();

al2.add("sona");
al2.add("Naina");
al2.add("nirjala");

al2.removeAll(al);

Iterator itr=al.iterator();

while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}