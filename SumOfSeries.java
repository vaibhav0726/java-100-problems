//Write Java program to find the sum of the given series:
//1 + (1*2) + (1*2*3) + ………. + (1*2*3* …… * n)

import java.lang.*;
import java.util.*;
public class SumOfSeries {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n, pro=1, sum=0;
        System.out.print("Enter a number : ");
        n = s.nextInt();
        for(int i=1; i<=n; i++){
            pro = 1;
            for(int j=1; j<=i; j++){
                pro = pro * j;
            }
            sum = sum + pro;
        }
        System.out.println("The sum is : " + sum);
    }
}
