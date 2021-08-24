//Write a program that prints a multiplication table for numbers up to n.
import java.lang.*;
import java.util.*;

class TableOfN{
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner  s=new Scanner(System.in);
        long n, pro=1;
        n = s.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(n + " X " + i + " = " + n*i);
        }
    }
}