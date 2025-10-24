/**
 * Justin Huynh
 * CS 876 
 * Assignment 2
 * 10/24/25
 * 
 * This class represents a Deck of cards. 
 */
 
public class Deck {

   private Card[] cards;
   private int topCard;
   
   public Deck() {
      cards = new Card[52];
      topCard = 51;
      
      int count = 0;
      for (int s = 0; s <= 3; s++) {
         for (int r = 1; r <= 13; r++) {
            cards[count] = new Card(s, r);
            count++;
         }
      }
      
   }
   
   public Deck(boolean isSorted) {
      if (isSorted == true) {
         cards = new Card[52];
         topCard = 51;
      
         int count = 0;
         for (int s = 0; s <= 3; s++) {
            for (int r = 1; r <= 13; r++) {
               deck[count] = new Card(s, r);
               count++;
            }
         }
      }
      else { 
         cards = new Card[52];
         topCard = 51;
      
         int count = 0;
         for (int s = 0; s <= 3; s++) {
            for (int r = 1; r <= 13; r++) {
               deck[count] = new Card(s, r);
               count++;
            }
         }
         cards.shuffle();
      }
   
   }
   
   public Deck(Deck other) {
      this.topCard = other.topCard;
      this.cards = new Card(other.cards.length);
      for (int i = 0; i <= topCard; i++) {
         this.cards[i] = new Card(other.cards[i]);
      }
   }
   
   @Override
   public String toString() {
      
   } 
}
