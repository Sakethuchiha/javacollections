import java.util.*;

public class Priorityqueue1 {
    public static void main(String [ ] args)
    {
        PriorityQueue<Integer> p1 = new PriorityQueue<>();
        //priorityqueue works on the datastructure min heap where the first element is the smallest element and 
        //rest are stored from last 
        
        p1.offer(36);
        p1.offer(24);
        p1.offer(48);

        p1.offer(12);
        //if we print the output will be [12,24,36,48]
        System.out.println(p1);
        p1.peek();
        System.out.println(p1.peek());
        p1.poll();
        System.out.println(p1);
        //we can also convert the priority queue to a max heap by a comparator 
        PriorityQueue<Integer> p2 = new PriorityQueue<>(Comparator.reverseOrder());
        p2.offer(36);
        p2.offer(24);
        p2.offer(48);

        p2.offer(12);
        System.out.println(p2);
        
        p2.poll();
        System.out.println(p2);
        


    }
    
}
