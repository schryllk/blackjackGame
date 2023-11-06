/**
 * This class will contain one card
 * CardValue 2-10 Jack, Queen, King, Ace
 * Suit Heart, Club, Spade, Diamond
 */
public class Card {
    private String suit;
    private String rank;
    
    //Constructor
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    //getters
    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }
  
    public int getValue(){
        //creating an instance of class CardValue so I can access getCardValue method from class CardValue
        CardValue cardValue = new CardValue();
        
        return cardValue.getCardValue(rank);
    }

    @Override  
    public String toString() {
        return rank + " of " + suit;
    }

    
    
}
