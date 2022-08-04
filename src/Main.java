import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Random rn = new Random();
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while (run) {
            int x = rn.nextInt(1, 5);
            System.out.print("Guess: ");
            int guess = sc.nextInt();
            if (guess == x){
                System.out.println("You Win!!");
                run = false;
            }
            else{
                System.out.println("You Lose!! the number was " + x + ", Try Again.");
            }
        }
    }
}