import java.util.Scanner;

public class Opgave3_14 {


        // Task 3.14
        // Promt user to guess weather the flip of a coin results in heads(1) or tails(0)
        // Generate an integer 0 or 1 randomly
        // Input 0 or 1

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Head or Tails? Please, use 1 for Head or 0 for Tail! ");
            int heads = input.nextInt();
            int tails = (int) (Math.random() * 2 );   // random output

            if (heads == tails) {
                System.out.println("Congratulation You guessed right!");
            }  else {
                System.out.println("Sorry You guessed wrong. Please try again!");  // random output
            }
        }
    }

