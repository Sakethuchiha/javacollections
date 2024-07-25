import java.util.*;

public class LearnCollectionsclass {
   
    public static void main(String[] args) {
            ArrayList<Integer> li = new ArrayList<>();
            li.add(2);
            li.add(3);
            li.add(4);
            li.add(1);
            li.add(8);
            System.out.println(Collections.max(li));
            System.out.println(Collections.min(li));
            System.out.println(Collections.frequency(li, 3));



            
        
    }
    
}
