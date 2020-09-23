import java.util.Scanner;

    public class Opgave3_6 {

        // Task 3.6
        // Enter weight in pounds
        // Enter height in feet
        // Enter height in inches

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Promt the user to enter weight in pounds
            System.out.println("Enter weight in pounds: ");
            double weight = input.nextDouble();

            // Promt the user to enter height in feet
            System.out.println("Enter height in feet: ");
            double feet = input.nextDouble();

            // Promt the user to enter height in inches
            System.out.println("Enter height in inches: ");
            double inch = input.nextDouble();

            final double KILOGRAMS_PER_POUND = 0.45359237;  // Constant
            final double METERS_PER_INCH = 0.0254;  // Constant
            final double METERS_PER_FEET = 0.3048;  // Constant

            // feet to meter
            // inch to meter
            // add feet to meter with inch to meter

            // Compute BMI
            double weightInKilograms = weight * KILOGRAMS_PER_POUND;
            double heightInch = inch * METERS_PER_INCH;
            double heightFeets = feet * METERS_PER_FEET;

            double heightInMeters = heightFeets + heightInch;

            double bmi = weightInKilograms /
                    (heightInMeters * heightInMeters);

            // Display the result
            System.out.println("BMI is " + bmi);
            if (bmi < 18.5)
                System.out.println("Underweight");
            else if (bmi < 25)

                System.out.println("Normal");
            else if (bmi < 30)
                System.out.println("Overweight");
            else
                System.out.println("Obese");
        }
    }

