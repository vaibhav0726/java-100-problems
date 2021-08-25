//Write a program that prints all prime numbers upto n.
import java.lang.*;
import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long n;
        int isPrime;
        System.out.print("Enter any number : ");
        n = s.nextInt();
        System.out.print("Prime numbers are : ");
        for(long i = 2; i <= n; i++){
            isPrime = 0;
            for(long j = 2; j <= i/2; j++){
                 if(i % j == 0){
                     isPrime = 1;
                     break;
                 }
            }
               
            if(isPrime==0)
                System.out.print(i + " ");
        }


    }
}
