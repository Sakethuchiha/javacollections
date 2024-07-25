import java.util.*;
public class StackExample {
    
    
    public static void main (String[] args)
    {
        Stack<String> animals = new Stack<>();
        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Cat");
        animals.push("DOg");
        System.out.println("stack:"+animals);
        System.out.println("stack:"+animals.peek());
        System.out.println("stack:"+animals);
        animals.pop();
        System.out.println("stack:"+animals);
        
    }
    
}