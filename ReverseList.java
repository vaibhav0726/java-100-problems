// Write function that reverses a list, preferably in place.
import java.lang.*;
import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
           
        List<String> HelloWorld = new ArrayList<>(Arrays.asList("Hello", "Java", "World!"));
        Collections.reverse(HelloWorld);
        System.out.println(HelloWorld);
    }    
}
