

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


 
public class ArrayListSort {
     
    public static void main(String a[])
  {
       List<Empl> list = new ArrayList<Empl>();

        list.add(new Empl("Ram",3000));

        list.add(new Empl("Mahesh",6000));

        list.add(new Empl("naina",200000));

        list.add(new Empl("Prasad",2400));

        Collections.sort(list,new Salary());

        System.out.println("Sorted list entries: ");

        for(Empl e:list)
     {
            System.out.println(e);
        }
    }
}
 
class Salary implements Comparator<Empl>
{
     @Override//annotation 
    public int compare(Empl e1, Empl e2) 
   {
        if(e1.getSalary() < e2.getSalary())
     {
            return 1;
        } 
        else 
      {
            return -1;
        }
    }
}
 
class Empl{
     
    private String name;
    private int salary;
     
    public Empl(String n, int s){
        this.name = n;
        this.salary = s;
    }
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString()
  {
        return "Name: "+this.name+"-- Salary: "+this.salary;
    }
}