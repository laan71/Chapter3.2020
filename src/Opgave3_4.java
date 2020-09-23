public class Opgave3_4 {

    public static void main(String[] args) {

        int number = (int)(Math.random() * 12);

        switch (number % 12) {
            case 0:
                System.out.println("The month is January");
                break;
            case 1:
                System.out.println("The month is February");
                break;
            case 2:
                System.out.println("The month is March");
                break;
            case 3:
                System.out.println("The month is April");
                break;
            case 4:
                System.out.println("The month is May");
                break;
            case 5:
                System.out.println("The month is June");
                break;
            case 6:
                System.out.println("The month is July");
                break;
            case 7:
                System.out.println("The month is August");
                break;
            case 8:
                System.out.println("The month is September");
                break;
            case 9:
                System.out.println("The month is October");
                break;
            case 10:
                System.out.println("The month is November");
                break;
            case 11:
                System.out.println("The month is December");
                break;
            default:
                System.out.println("This month doesn´t excist");
                break;
        }
    }
}
