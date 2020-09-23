import java.util.Scanner;

public class Opgave3_5 {

    // Task 3.5
    // Enter an integer for todays day of the week.
    // Also enter the number of days after today for a future day and display it.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String today;
        String futureDay;

        System.out.println("Enter an integer for todays day of the week: ");
        int day = input.nextInt();
        System.out.println("Enter the numbers of days elapsed since today: ");
        int elapsed = input.nextInt();

        if (day == 0)
            today = "Sunday";
        else if (day == 1)
            today = "Monday";
        else if (day == 2)
            today = "Tuesday";
        else if (day == 3)
            today = "Wednesday";
        else if (day == 4)
            today = "Thursday";
        else if (day == 5)
            today = "Friday";
        else
            today = "Saturday";

        int calculateFutureDay = (day + elapsed) % 7;


        switch(calculateFutureDay) {
            case 0:
                futureDay = "Sunday";
                break;
            case 1:
                futureDay = "Monday";
                break;
            case 2:
                futureDay = "Tuesday";
                break;
            case 3:
                futureDay = "Wednesday";
                break;
            case 4:
                futureDay = "Thursday";
                break;
            case 5:
                futureDay = "Friday";
                break;
            default:
                futureDay = "Saturday";
                break;
        }

        System.out.println("Today is " + today + " and the future day is " + futureDay + "!");
    }
}




