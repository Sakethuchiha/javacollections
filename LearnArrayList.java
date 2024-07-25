package collections;
import java.util.*;
import java.util.ArrayList;
public class LearnArrayList {
    public static void main(String args[])
    {
    ArrayList<Integer> saketh = new ArrayList<>();
    saketh.add(1);
    saketh.add(123);
    saketh.add(1,26);
    System.out.print(saketh);
    //we can add new list into the current list using addall function 
    ArrayList<Integer> saketh1 = new ArrayList<>();
    saketh1.add(2);
    saketh1.add(3);
    saketh1.add(26);
    saketh.addAll(saketh1);
    System.out.print(saketh);
    //to get the elements we use get 
    System.out.println(saketh.get(1));
    saketh.remove(3);
    saketh.remove(Integer.valueOf(26));
    //to remove the entire list we use clear function 
    saketh1.clear();
    //to update the value of any element we use set()
    saketh.set(3,221);
    saketh.contains(2);
    //whenever we print the list using sout it invokes tostring method
    //to iterate in the list 
    for(int i=0;i<saketh.size();i++)
    {
        System.out.println("the element is "+saketh.get(i));
    }
    for(Integer element:saketh)
    {
        System.out.println("the element is "+element); //foreach iterator 
    }
    Iterator<Integer> it = saketh.iterator();
    while(it.hasNext())
    {
        System.out.println(it.next());
    }

    }
    
        
    
    
   
}

