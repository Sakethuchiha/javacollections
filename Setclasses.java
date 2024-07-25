import java.util.HashSet;
import java.util.Set;

public class Setclasses {
    public static void main(String[] args) {
        Set<Student> s1 = new HashSet<>();
         s1.add(new Student(2,"saketh"));
         s1.add(new Student(3,"rakesh"));
         s1.add(new Student(4,"harsha"));
         s1.add(new Student(2,"tharun"));
         System.out.println(s1);

    }
}
