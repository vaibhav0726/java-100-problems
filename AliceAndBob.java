//Modify the second program such that only the users Vaibhav and Varshney are greeted with their names.

import java.lang.*;
import java.util.*;

class AliceAndBob {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String name;
        name = s.nextLine();
        if (name.equalsIgnoreCase("Vaibhav") || name.equalsIgnoreCase("Varshney"))
        {
            System.out.println("Welcome Mr/Mrs : " +name);
        }
    }
}
