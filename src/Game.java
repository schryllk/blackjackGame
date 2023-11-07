import java.util.Scanner;

/**
 * This class will play the Game
 */
public class Game {
    private Deck deck;
    private Player playerHand;
    private Player dealerHand;
    private Scanner scanner;

    // constructor
    public Game() {
        deck = new Deck();
        playerHand = new Player();
        dealerHand = new Player();
        scanner = new Scanner(System.in);
    }

    /**
     * @return play method will initiate the game
     */
    public void play() {
        deck.shuffleDeck();

        // two cards for the player
        playerHand.addCard(deck.drawACard());
        playerHand.addCard(deck.drawACard());

        // two cards for the dealer
        dealerHand.addCard(deck.drawACard());
        dealerHand.addCard(deck.drawACard());

        /**
         * todo create a loop that will check the player and dealers hand
         */
        while (true) {
            System.out.println("Your cards: " + playerHand.getHand());
            System.out.println("Your score is : " + playerHand.calculateScore());
            System.out.println("Dealer's first card: " + dealerHand.getHand().get(0));// get the first card

            // this will check if the player's score is 21 and the dealer don't have 21
            if (playerHand.calculateScore() == 21 && dealerHand.calculateScore() != 21) {

                System.out.println("Dealer's cards: " + dealerHand.getHand());
                System.out.println("Blackjack! You win!");
                break;
            }
            if (playerHand.calculateScore() == 21 && dealerHand.calculateScore() == 21) {
                System.out.println("Player and dealer has 21 it's a Push(Neither one wins)");
                break;
            }

            System.out.print("Press 'H' (for Hit) to get another card, or press 'S' (for Stand) to pass: ");
            String choice = scanner.nextLine();

            /**
             * this conditional will recognize the user's input (HIT/STAND) if player press
             * h
             * the player will get a new card and if player press s they won't get an
             * additional card
             * the dealer will show his cards
             */
            if (choice.equalsIgnoreCase("h")) {
                playerHand.addCard(deck.drawACard());
                if (playerHand.calculateScore() > 21) {
                    System.out.println("Your cards: " + playerHand.getHand());
                    System.out.println("Dealer's cards: " + dealerHand.getHand());
                    System.out.println("Your score is over 21. Dealer wins!");
                    break;
                }
            } else if (choice.equalsIgnoreCase("s")) {
                // dealer will hit if the value of their card is below 17.Then stand if the
                // value is above 17
                while (dealerHand.calculateScore() < 17) {
                    dealerHand.addCard(deck.drawACard());

                }
                System.out.println("Dealer's cards: " + dealerHand.getHand());
                System.out.println("Dealer's score: " + dealerHand.calculateScore());

                if (dealerHand.calculateScore() > 21 || dealerHand.calculateScore() < playerHand.calculateScore()) {
                    System.out.println("You win!");
                } else if (dealerHand.calculateScore() > playerHand.calculateScore()) {
                    System.out.println("Dealer wins!");
                } else {
                    System.out.println("It's a draw!");
                }
                break;
            }

        }
    }

    public void playAgain() {
        String userInput = "";

        do {

            // Reset player and dealer hands
            playerHand.clearHand();
            dealerHand.clearHand();

            // Shuffle the deck for a new game
            deck.shuffleDeck();

            // Deal initial cards for the new game
            playerHand.addCard(deck.drawACard());
            playerHand.addCard(deck.drawACard());
            dealerHand.addCard(deck.drawACard());
            dealerHand.addCard(deck.drawACard());

            System.out.println("Would you like to play again?");
            userInput = scanner.nextLine();

            try {
                if (userInput.equalsIgnoreCase("y")) {
                    play();
                } else if (userInput.equalsIgnoreCase("n")) {
                    System.out.println("Thanks for Playing!");
                    System.exit(0);
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid Input! Try Again.");
            }
        } while (userInput.equalsIgnoreCase("y"));

    }

}
