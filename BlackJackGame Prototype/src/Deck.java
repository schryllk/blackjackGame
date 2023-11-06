import java.util.ArrayList;

/**
 * This class will contain the the playing deck
 * Makes a brand new deck with 52 cards, 13 cards of each suit
 */
public class Deck {
    // todo create an array list of cards
    private ArrayList<Card> cards = new ArrayList<Card>();

    // constructor
    public Deck() {

        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

        // loop that will create a deck of cards
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    /** @return this method will shuffle the deck of cards*/
    public void shuffleDeck() {
        for (int i = 0; i < cards.size(); i++) {
            int randomCards = (int) (Math.random() * cards.size()); // Maths.random() returns a double, so for us to get
                                                                    // an int we multiply this to (int)
            Card tempCards = cards.get(i);
            cards.set(i, cards.get(randomCards));
            cards.set(randomCards, tempCards);

        }

    }

    /** @return removes a card at index 0(top card) from the deck*/
    public Card drawACard() {
        return cards.remove(0);
    }
}
