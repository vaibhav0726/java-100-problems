// Modify the fourth program such that only multiples of three or five are considered in the sum, e.g. 3, 5, 6, 9, 10, 12, 15 for n=17
import java.lang.*;
import java.util.*;

class MultipleOf3or5 {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        int n, sum=0;
        Scanner s=new Scanner(System.in);
        n = s.nextInt();
        for(int i=1; i<=n ; i++){
            if(i%3==0 || i%5==0){
                sum=sum+i;
            }
        }
        System.out.println("Sum is : " + sum);
    }
}
