/**
 * This class will contain the value
 * An Ace will either be a 1 = 11
 * King, Queen, Jack will be 10
 * Other card will be face value
 */
public class CardValue {

    /**
     * 
     * @param rank
     * @return returns the integer value of the card ie. King = 10
     * 
     */
    public int getCardValue(String rank) {
        if (rank.equals("Ace")) {
            return 11;
        } else if (rank.equals("King") || rank.equals("Queen") || rank.equals("Jack")) {
            return 10; 
        }
        //this will convert the String value of the Array[] rank into integers
        return Integer.parseInt(rank); 

    }

}
