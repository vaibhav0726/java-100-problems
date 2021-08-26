//Write a guessing game where the user has to guess a secret number. After every guess the program tells the user whether their number was too large or too small.
//At the end the number of tries needed should be printed. 
//It counts only as one try if they input the same number multiple times consecutively.
import java.lang.*;
import java.util.*;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int guessedNumber= (int) (Math.random()* 999 +1);
        int n, count=0;
        while (true){
            System.out.print("Guess a number btw 1-1000 : ");
            n = s.nextInt();
            count = count + 1;
            if(guessedNumber==n){
                System.out.println("Your guess is correct. Congratulations!");
                System.out.println("You guessed it in "+ count + " number of times");
                break;
            }
            else if (guessedNumber<n){
                System.out.println("Your guess is greater than the secret number!");
            }
            else{
                System.out.println("Your guess is less than secret number!");
            }
            
        }
    }   
}
