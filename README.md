# Blackjack
Welcome to the Casino. The Casino owner want to see a prototype of a BlackJack application, proof of concept. Using only 1 deck and one player, no beating. Just to make sure that the basic logic of the application works before moving forward with the application.

## The rules are simple...

Once all cards are drawn, whoever has a total closer to 21 than the dealer wins. If player’s hand and dealer’s hand have an equal value, it’s a tie.

## Deal phase
1. Each player will recieve two cards
   - if a player draws 21 he wins 3/2
   - if the dealer gets 21 the player lose and play ends
2. The dealers first card face down
3. The player will be able to Hit or Stand
    - if a player Hits the player gets an additonal card
    - if a player Stands the play ends
    - if a player gets 21 or above his play ends (Bust)
4. The dealer continues to draw cards until
   - Dealer gets above 16
   - Dealer gets above 21 (Bust)
5. When all play ends
   - Bust hands lose
   - Hands that do not beat the dealer lose
   - Hands that beat the dealers hand win 1/1
   - Hands that tie with the dealer don't lose or win
6. Play resumes with new deal
7. Prompt Player Prompt Player to play again (Yes/No)
   
Sample Display
```
Your cards: [10 of Hearts, 4 of Hearts]
Your score is : 14
Dealer's first card: 6 of Hearts
Press 'H' (for Hit) to get another card, or press 'S' (for Stand) to pass:
```
