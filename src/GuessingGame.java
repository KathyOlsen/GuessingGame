import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        Random r = new Random();
        int secretNum = 1 + r.nextInt(10);

        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        int guess = 0;
        while(guess != secretNum){
            System.out.println("Your guess: ");
            guess = key.nextInt();
            if (guess != secretNum){
                System.out.println("That is incorrect. Guess again.");
            }else{
                System.out.println("That's right! You're a good guesser.");
            }
        }
    }
}