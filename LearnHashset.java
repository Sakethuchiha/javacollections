//set interface implements Enumset,Hashset,Treeset and Linkedhashset
//order is not defined in the set and duplicates are not allowed in the set
//set internally uses hashing thats why it doesnt allow duplicate elements 

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.*;

public class LearnHashset {
    public static void main( String args[])
    {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>(); //this prints the set in the order of the elements entered
        Set<Integer> set3 = new TreeSet<>(); // this prints the elements in the sorted order
        set1.add(12);
        set1.add(32);
        set1.add(1);
        set1.add(5);
        System.out.println(set1);
        set1.remove(1);
        System.out.println(set1);
        System.out.println(set1.contains(2));
        System.out.println(set1.isEmpty());
        System.out.println(set1.size());
        set1.clear();
        System.out.println(set1);



    }
    
}
