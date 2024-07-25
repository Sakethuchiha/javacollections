package collections;

import java.util.*;


public class Linkedlistqueue {
    public static void main( String[ ] args)
    {
    Queue<Integer> queue = new LinkedList<Integer>();
    queue.offer(12);
    queue.offer(23);
    queue.offer(34);
    //offer is there for adding elements 
    //we can also add elements by add but it is used incase we need any exceptions
    System.out.println(queue.peek());//it is used to check which element is available next to get out of the queue
    //we can also use element() but it raises exceptions
    queue.poll();//is used to remove the element which is first added 
    //remove can also be used but it adds exceptions to the code 
    //Linkedist is implemented by List and queue interface and can use its methods.


    } 
    
}
