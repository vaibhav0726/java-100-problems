//Write a program that asks the user for a number n and prints the sum of the numbers 1 to n
import java.lang.*;
import java.util.*;

public class Sum0toN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, sum=0;
        System.out.print("Enter a number : ");
        n = s.nextInt();
        for (int i=1 ; i <= n ; i++) {
            sum=sum+i;
        }
        System.out.println("Sum from 0 to " + n + " is : " + sum);
    }
    
}