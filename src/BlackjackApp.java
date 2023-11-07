public class BlackjackApp {
    /**
     * This is the main class that will call the play method to start the blackjack
     * game
     * 
     * @author Schryll Schuch
     * 
     */

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to the Casino!");
        System.out.println("Let's play");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\r\n" + //
                "~.------..------..------..------..------..------..------..------..------.~\r\n" + //
                "~|B.--. ||L.--. ||A.--. ||C.--. ||K.--. ||J.--. ||A.--. ||C.--. ||K.--. |~\r\n" + //
                "~| :(): || :/\\: || (\\/) || :/\\: || :/\\: || :(): || (\\/) || :/\\: || :/\\: |~\r\n" + //
                "~| ()() || (__) || :\\/: || :\\/: || :\\/: || ()() || :\\/: || :\\/: || :\\/: |~\r\n" + //
                "~| '--'B|| '--'L|| '--'A|| '--'C|| '--'K|| '--'J|| '--'A|| '--'C|| '--'K|~\r\n" + //
                "~`------'`------'`------'`------'`------'`------'`------'`------'`------'~\r\n" + //
                "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Game game = new Game();
        game.play();

    }
}
