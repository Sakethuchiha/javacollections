// Map interface implements hashmap and treemap 
//map works in the values of keys and values and the keys should be unique.

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.*;

public class LearnMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> map1 = new TreeMap<>(); // all the keys are sorted by the treemap and are structured as trees
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);

        for( java.util.Map.Entry<String, Integer> e:map.entrySet())
        {
            System.out.println(e);
        }
        map.putIfAbsent("Two", 2);
        map.clear();
        map.size();
        map.keySet();
        map.containsKey("Two");
        map.containsValue(3);
        map.remove("Two");
        for(String e:map.keySet())
        {
            System.out.println(e);
        }
        for (Integer e:map.values())
        {
            System.out.println(e);
        }


    }
    
}
