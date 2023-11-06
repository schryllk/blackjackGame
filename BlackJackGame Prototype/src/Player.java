import java.util.ArrayList;

/**
 * This class will contain a player
 * blackjack player, either the user or the dealer.
 */
public class Player {
    private ArrayList<Card> hand;

    // constructor
    public Player() {
        hand = new ArrayList<>();
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    /**
     * @return method that will calculate the player and dealers card value
     */
    public int calculateScore() {
        int score = 0;
        int numOfAces = 0;

        for (Card card : hand) {
            score += card.getValue();
            if (card.getValue() == 11) {
                numOfAces++;
            }
        }

        while (score > 21 && numOfAces > 0) { // checks if there are aces on the hand and if the score is > 21
            score -= 10; // if there are aces on the hand and score is above 21 this will subtract 10
                         // from score to convert the Ace to 1
            numOfAces--;
        }
        return score;
    }

    /**
     * 
     * @return returns the complete value of a players hand ie. [3 of Diamonds]
     */
    public ArrayList<Card> getHand() {
        return hand;
    }

    /**
     * resets hand
     */
    public void clearHand() {
        hand.clear();
    }

}