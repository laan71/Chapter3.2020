import java.util.Scanner;

public class Opgave3_35 {

    // Task 3.35
    // Promt the user to enter an integer
    // Display weather the integer is an even or odd number

    private static Scanner Scanner;

    public static void main(String[] args) {

        int x;
        System.out.println("Please, enter an integer: ");
        Scanner number = new Scanner(System.in);
        x = number.nextInt();

        if (x % 2 == 0)
            System.out.println(+ x + " is an even number!");
        else if (x % 2 != 0)
            System.out.println(+ x + " is an odd number!");

    }
}
