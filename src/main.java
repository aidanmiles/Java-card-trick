import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        String[] SuitofHearts = {"K <3", "Q <3", "J <3", "A <3", "10 <3",
                "9 <3", "8 <3", "7 <3", "6 <3", "5 <3",
                "4 <3", "3 <3", "2 <3", "1 <3",};

        String card = SuitofHearts[new Random().nextInt(SuitofHearts.length)];

        // Users Card Guess
        System.out.println("Please enter your guess in the same format as the above code");
        Scanner User = new Scanner(System.in);
        String GuessedCard = User.nextLine();


        // Compares the users card guess against the codes card choice and prints the outcome.
        if(GuessedCard.equals(card)) {
            System.out.println("well done you guessed correctly !");
        }

        else System.out.println("Better Luck Next time, the card the code picked was " + card);

    }

}