//apart from the collection framework on top of it we have the collection class and the arrays claass
import java.util.*;
import java.util.Arrays;
public class Learnarraysclass {
    //to manipulate the primitive arrays we use this class
    public static void main(String[] args) {
        int array[] = {1,3,4,3,5,3,2,7,5,4,27,7,8,8};
        Arrays.sort(array);
        Arrays.fill(array, 2);
        Arrays.binarySearch(array, 3);
        
    }
    
}
