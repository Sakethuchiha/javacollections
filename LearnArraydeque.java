//arraydeque is double ended queue we can add elements from the start as well as from the end of the queue
import java.util.*;

public class LearnArraydeque {
    public static void main( String args[])
    {
        ArrayDeque<Integer> ard = new ArrayDeque<>();
        ard.offer(24);
        ard.offerFirst(12);
        ard.offerLast(36);
        System.out.println(ard);
        //output will be  [12,24,36]
        //we also have peekfirst,peeklast,polllast,pollfirst functions (uses camlecasing )
    }
    
}
