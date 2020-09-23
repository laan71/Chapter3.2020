import java.util.Scanner;

public class Opgave3_10 {

        public static void main(String[] args) {
            int number1 = (int)(Math.random() * 1000);
            int number2 = (int)(Math.random() * 1000);

            // Create a Scanner
            Scanner input = new Scanner(System.in);

            System.out.print(
                    "What is " + number1 + " * " + number2 + "? ");

            int answer = input.nextInt();

            System.out.println(
                    number1 + " * " + number2 + " = " + answer + " is " +
                            (number1 * number2 == answer));
        }
    }

