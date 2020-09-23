public class Opgave3_24 {

    // Task 3.24
    // Simulate picking a card for the deck
    // Deck of 52 cards
    // Rank Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King
    // Suit Clubs, Diamonds, Hearts, Spades

    public static void main(String[] args) {
        final int CARDS_IN_DECK = 52;
        String cardnumber;
        String suit;

        // Pick a card
        int number = (int) (Math.random() * CARDS_IN_DECK);
        // System.out.println("The card you picked is   ");  // udkommenteret for at få resultatet på 1 linje
        if (number % 13 == 0)
            //   System.out.println("Ace of ");
            cardnumber = "Ace";
        else if (number % 13 == 10)
            //   System.out.println("Jack of ");
            cardnumber = "Jack";
        else if (number % 13 == 11)
            //   System.out.println("Queen of ");
            cardnumber = "Queen";
        else if (number % 13 == 12)
            //   System.out.println("King of ");
            cardnumber = "King";
        else
            //   System.out.println((number % 13) + " of");
            cardnumber =  String.valueOf(number % 13);   // ændret for at få resultatet på 1 linje

        if (number / 13 == 1)
            //  System.out.println("Clubs");
            suit = "Clubs";
        else if (number / 13 == 2)
            //  System.out.println("Diamonds");
            suit = "Diamonds";
        else if (number / 13 == 3)
            //   System.out.println("Hearts");
            suit = "Hearts";
        else
            //   System.out.println("Spades");
            suit = "Spades";


        System.out.println("The card you picked is " + cardnumber + " of " + suit);   // giver resultatet på 1 linje frem for 2
    }
}