//retainALL
import java.util.*;

public class ArrayListeg5
{
public static void main(String args[])
{
ArrayList<String> al=new ArrayList<String>();

al.add("sarthak");
al.add("naina");
al.add("nirjala");

ArrayList<String> al2=new ArrayList<String>();

al2.add("sarthak");
al2.add("naina");

al.retainAll(al2);

System.out.println("Iterating the elements after retaining the elements of al2");

Iterator itr=al.iterator();

while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}