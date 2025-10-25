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
   
   public void shuffle() {
      for (int i = topCard; i > 0; i--) {
         Card temp = cards[i];
         int random = (int) (Math.random() * (i + 1)); // finds random value from the topCard (i) and 0
         cards[i] = cards[random];
         cards[random] = temp; // swaps value of topCard (i) and random value
      }
   }
   
   public Deck(boolean isSorted) {
      if (isSorted == true) {
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
      else { 
         cards = new Card[52];
         topCard = 51;
      
         int count = 0;
         for (int s = 0; s <= 3; s++) {
            for (int r = 1; r <= 13; r++) {
               cards[count] = new Card(s, r);
               count++;
            }
         }
         shuffle();
      }
   
   }
   
   public Deck(Deck other) {
      this.topCard = other.topCard;
      this.cards = new Card[other.cards.length];
      for (int i = 0; i <= topCard; i++) {
         this.cards[i] = new Card(other.cards[i]);
      }
   }
   
   @Override
   public String toString() {
      String result = "";
      
      if (topCard == 51) {
         for (int r = 0; r < 13; r++) {
            for (int s = 0; r < 4; r++) {
               int index = (13 * s) + r;  // finds what index of current card; multiples 13 by suit and adds rank; ace of diamonds = (13 * 1) + 1 = 14 
               result += cards[index].toString() + "\t";
            }
            result += "\n";
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
      Deck compare = (Deck) other   ;
      
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
      if (cardsNeeded > topCard + 1) { // checks if there is enough cards in the deck; returns null if not
         return null;
      }
      
      Deck[] dealHands = new Deck[hands]; // new array for number of hands
      
      for (int i = 0; i < hands; i++) {
         dealHands[i] = new Deck(); // create an empty array of decks for each hand
         dealHands[i].cards = new Card[cardsPerHand]; // gives each card for the hand a value
         
         for (int j = 0; j < cardsPerHand; j++) {
            dealHands[i].cards[j] = this.cards[topCard]; // gives each hand number of cards needed
            topCard--; // removes a card from deck
         }
         
      }
      return dealHands;
   }
   
   public Card pick() {
      int random = (int) (Math.random() * topCard + 1); // generate random number from cards
      Card randomCard = cards[random]; // sets
      
      for (int i = random; i <= topCard; i++) {
         cards[i] = cards[i + 1]; // shifts every card left starting at the random card picked
      }
      topCard--; // removes card from deck
      return randomCard; // returns card picked
   }
   
   public void selectionSort() {
      for (int i = 0; i < topCard; i++) { 
         int min = i;
         
         // finds min of unnsorted section
         for (int j = i + 1; j <= topCard; j++) {
            if (cards[j].compareTo(cards[min]) < 0) {
               min = j;
            }
         }
         
         // swap i and min
         Card temp = cards[i];
         cards[i] = cards[min];
         cards[min] = temp;
      }
   }
   
   public void mergeSort() {      
      mergeSort(cards, 0, topCard);
   }
   
   public void mergeSort(Card[] arr, int left, int right) {
      if (left < right) {
         int mid = (left + right) / 2;    // find middle value
         mergeSort(arr, left, mid);    // recursively sorts left side
         mergeSort(arr, mid + 1, right);    // recursively sorts right side
         merge(arr, left, mid, right);    // merges two sides together
      }  
   }
   
   private void merge(Card[] arr, int left, int mid, int right) {
      Card[] temp = new Card[right - left + 1];
      int i = left;
      int j = mid + 1;
      int k = right;
      
      while (i <= mid && j <= right) {
         if (arr[i].compareTo(arr[j]) <= 0) {
            temp[k] = arr[i];
            i++;
         }
         else {
            temp[k] = arr[j];
            j++;
         }
         k++;
      }
      
      while (i <= mid) {
         temp[k] = arr[i];
         i++;
         k++;
      }
      
      while (j <= right) {
         temp[k] = arr[j];
         k++;
         j++;
      }
      
      for (k = left; k <= right; k++) {
         arr[k] = temp[k];
      }
      
   }
   
   public int getTopCard() {
      return topCard;
   }
   
   
}