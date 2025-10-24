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
   
   public void shuffle() {
      for (int i = topCard; i > 0; i--) {
         Card temp = cards[i];
         int random = (int) (Math.random() * (i + 1)) // finds random value from the topCard (i) and 0
         cards[i] = cards[random]
         cards[random[ = cards[temp] // swaps value of topCard (i) and random value
      }
   }
   
   @Override
   public String toString() {
      String result = "";
      
      if (topCard == 51) {
         for (int r = 0; r <= 13; r++) {
            for (int s = 0; r <= 3; r++) {
               int index = (13 * s) + r;  // finds what index of current card; multiples 13 by suit and adds rank; ace of diamonds = (13 * 1) + 1 = 14 
               result += cards[index].toString() + "\t";
            }
            result += "\n"
         }
      }
      else {
         for (int i = 0; i <= topCard; i++) {
            result += (i + 1) + ". " + cards[i].toString() + "\n";
         }
      }
      return result;
   } 
   
   @Override
   public boolean equals(Object other) {
      Deck compare = deck (other);
      
      if (this.topCard != compare.topCard) {
         return false;
      } 
      
      for (int i = topCard; i >= 0; i--) {
         if (!this.cards[i].equals(compare.cards[i])) {
            return false;
         }
      }
      return true;
   }
   
   public Deck[] deal(int hands, int cardsPerHand) {
   
      int cardsNeeded = hands * cardsPerHand;
      if (cardsNeeded < topCard + 1) { // checks if there is enough cards in the deck; returns null if not
         return null;
      }
      
      Deck dealHands = new Deck[hands]; // new array for number of hands
      
      for (int i = 0; i < hands; i++) {
         dealHands[i] = new Deck(); // create an empty array of decks for each hand
         dealHands[i].cards = new Card(cardsPerHand); // gives each card for the hand a value
         
         for (int j = 0; j < cardsPerHand; j++) {
            dealHands[i].cards[j] = this.cards[topCard]; // gives each hand number of cards needed
            topCard--; // removes a card from deck
         }
         
      }
      return dealHands;,
   }
   
   public Card pick() {
      int random = (int) (Math.Random() * topCard + 1) // generate random number from cards
      Card randomCard = cards[random]; // sets
      
      for (i = random; i <= topCard; i++) {
         cards[i] = cards[i + 1]; // shifts every card left starting at the random card picked
      }
      topCard--; // removes card from deck
      return randomCard; // returns card picked
   }
   
   public void selectionSort() {
      for (int i = 0; i <= topCard; i++) { 
         int min = i;
         
         // finds min of unnsorted section
         for (int j = i + 1; i <= topCard; j++) {
            if (cards[i].compareTo(cards[min] < 0) {
               min = j;
            }
         }
         
         // swap i and min
         Card temp = card[i];
         cards[i] = cards[min];
         cards[min] = cards[temp];
      }
   }
   
   public void mergeSort() {
   
      public void mergeSort(Card[] arr, int left, int right) {
         
      }
      
   }
   
   public int getTopCard() {
      return topCard;
   }
   
   
}