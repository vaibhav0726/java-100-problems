//Write a program that asks the user for a number n and gives them the possibility to choose between computing the sum and computing the product of 1,…,n.
import java.lang.*;
import java.util.*;

class SumOrProduct{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n, sum=0, pro=1, choice;
        System.out.print("Enter any number : ");
        n = sc.nextInt();
        System.out.print("Enter 1 for sum or 2 for product : ");
        choice = sc.nextInt();
        
    switch(choice) 
    {
      case 1: 
        for(int i=1;i<=n;i++) {
          sum += i;
        }
        System.out.println("Sum is = " + sum);
        break;

      case 2: 
        for(int i=1; i<=n; i++) {
          pro *= i;
        }
        System.out.println("Product is = " + pro);
      break;

      default: 
        System.out.println("Invalid Input");
        break;
    }
    



    }
}