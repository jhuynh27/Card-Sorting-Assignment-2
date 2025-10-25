/**
 *
 * This class represents a Card object. 
 *
 * @author Justin Huynh
 */
public class Card implements Comparable<Card> {
  /**
   *  Private fields representing the rank and suit of a card
   */
   private int suit;    // clubs - 0, diamonds - 1, hearts - 2, spades - 3
   private int rank;    // Ace – 1, 2-10 their numerical value, 11 – Jack, 12 – Queen, 13 – King
   
  /**
   * Default constructor for a card.
   * Initializes a card to the default values: Ace of Clubs (suit = 0 and rank = 1)
   */
   public Card() {
      suit = 0;
      rank = 1;
   }
   
  /**
   * Creates a card with the specified suit and rank.
   * @param suit the values for a card's suit (0-3).
   * @param rank the values for a card's rank (1-13).
   */
   public Card(int suit, int rank) {
      this.suit = suit;
      this.rank = rank;
   }
   
  /**
   * Creates a card using the specified String names for suit and rank.
   * @param suit the String name of a card's suit ("Clubs", "Spades")
   * @param rank the String name of a card's rank ("Ace", "Seven", "King")
   */
   public Card(String suit, String rank) {
      if (suit.equalsIgnoreCase("Clubs")) {
         this.suit = 0;
      }
      else if (suit.equalsIgnoreCase("Diamonds")) {
         this.suit = 1;
      }
      else if (suit.equalsIgnoreCase("Hearts")) {
         this.suit = 2;
      }
      else if (suit.equalsIgnoreCase("Spades")) {
         this.suit = 3;
      }
      
      if (rank.equalsIgnoreCase("Ace")) {
         this.rank = 1;
      }
      else if (rank.equalsIgnoreCase("Two")) {
         this.rank = 2;
      }
      else if (rank.equalsIgnoreCase("Three")) {
         this.rank = 3;
      }
      else if (rank.equalsIgnoreCase("Four")) {
         this.rank = 4;
      }
      else if (rank.equalsIgnoreCase("Five")) {
         this.rank = 5;
      }
      else if (rank.equalsIgnoreCase("Six")) {
         this.rank = 6;
      }
      else if (rank.equalsIgnoreCase("Seven")) {
         this.rank = 7;
      }
      else if (rank.equalsIgnoreCase("Eight")) {
         this.rank = 8;
      }
      else if (rank.equalsIgnoreCase("Nine")) {
         this.rank = 9;
      }
      else if (rank.equalsIgnoreCase("Ten")) {
         this.rank = 10;
      }
      else if (rank.equalsIgnoreCase("Jack")) {
         this.rank = 11;
      }
      else if (rank.equalsIgnoreCase("Queen")) {
         this.rank = 12;      
      }
      else if (rank.equalsIgnoreCase("King")) {
         this.rank = 13;
      }
   }
   
  /**
   * Creates a card with the specified String name for suit and int value for rank.
   * @param suit the String name of a card's suit ("Clubs", "Spades")
   * @param rank the int values for a card's rank (1-13).
   */
   public Card(String suit, int rank) {
      this.rank = rank;
      
      if (suit.equalsIgnoreCase("Clubs")) {
         this.suit = 0;
      }
      else if (suit.equalsIgnoreCase("Diamonds")) {
         this.suit = 1;
      }
      else if (suit.equalsIgnoreCase("Hearts")) {
         this.suit = 2;
      }
      else if (suit.equalsIgnoreCase("Spades")) {
         this.suit = 3;
      }
   }
   
   /**
   * Creates a card with the specified int value for suit and String name for rank.
   * @param suit the int name of a card's suit (0-3)
   * @param rank the String name for a card's rank (1-13).
   */
   public Card(int suit, String rank) {
      this.suit = suit;
      
      if (rank.equalsIgnoreCase("Ace")) {
         this.rank = 1;
      }
      else if (rank.equalsIgnoreCase("Two")) {
         this.rank = 2;
      }
      else if (rank.equalsIgnoreCase("Three")) {
         this.rank = 3;
      }
      else if (rank.equalsIgnoreCase("Four")) {
         this.rank = 4;
      }
      else if (rank.equalsIgnoreCase("Five")) {
         this.rank = 5;
      }
      else if (rank.equalsIgnoreCase("Six")) {
         this.rank = 6;
      }
      else if (rank.equalsIgnoreCase("Seven")) {
         this.rank = 7;
      }
      else if (rank.equalsIgnoreCase("Eight")) {
         this.rank = 8;
      }
      else if (rank.equalsIgnoreCase("Nine")) {
         this.rank = 9;
      }
      else if (rank.equalsIgnoreCase("Ten")) {
         this.rank = 10;
      }
      else if (rank.equalsIgnoreCase("Jack")) {
         this.rank = 11;
      }
      else if (rank.equalsIgnoreCase("Queen")) {
         this.rank = 12;      
      }
      else if (rank.equalsIgnoreCase("King")) {
         this.rank = 13;
      }
   }
   
  /**
   * Creates a card using another card, with the same suit and rank
   * @param c the card being copied
   */
   public Card(Card c) {
      this.suit = c.getSuitInt();
      this.rank = c.getRank();
   }
   
  /**
   * Returns the full String name for a card's suit
   * @return the String representation of a card's suit ("Clubs", "Spades")
   */
   public String getSuit() {
      if (suit == 0) {
         return "Clubs";
      }
      else if (suit == 1) {
         return "Diamonds";
      }
      else if (suit == 2) {
         return "Hearts";
      }
      else if (suit == 3) {
         return "Spades";
      }
      return "Unknown suit";  
   }  
   
   /**
   * Returns the int value for a card's rank.
   * @return the rank as an int (1-13).
   */
   public int getRank() {
      return rank;
   }
   
  /**
   * Returns the int value for a card's suit.
   * @return the suit as an int (0-3).
   */
   public int getSuitInt() {
      return this.suit;
   }
   
  /**
   * Returns the full String name for a card's rank
   * @return the String representation of a card's rank ("Ace", "Seven", "King")
   */
   public String getRankStr() {
      if (rank == 1) {
         return "Ace";
      }
      if (rank == 2) {
         return "Two";
      }
      if (rank == 3) {
         return "Three";
      }
      if (rank == 4) {
         return "Four";
      }
      if (rank == 5) {
         return "Five";
      }
      if (rank == 6) {
         return "Six";
      }
      if (rank == 7) {
         return "Seven";
      }
      if (rank == 8) {
         return "Eight";
      }
      if (rank == 9) {
         return "Nine";
      }
      if (rank == 10) {
         return "Ten";
      }
      if (rank == 11) {
         return "Jack";
      }
      if (rank == 12) {
         return "Queen";
      }
      if (rank == 13) {
         return "King";
      }
      return "Unknown rank";
   }
   
  /**
   * Compares a card with another card for order.
   * @param other the card to be compared.
   * @return a negative integer, zero, or a positive integer based on if the card is 
   * less than, equal to, or greater than the specified card its being compared to.
   */ 
   public int compareTo(Card other) {
      if (this.suit != other.getSuitInt()) {
         return this.suit - other.getSuitInt();
      }
      return this.rank - other.getRank();
   }
   
  /**
   * Checks if a card is equal to another card.
   * A card is considered equal if it has the exact same suit and rank values.
   * @param other the card to be compared against.
   * @return true if the cards are equivalent; false if otherwise.
   */
   @Override
   public boolean equals(Object other) {
           
      Card otherCard = (Card) other;
      return this.suit == otherCard.getSuitInt() && this.rank == otherCard.getRank();
         
   }
  /**
   * Returns a String representation for the card
   * @return a formatted String that describes the card
   */
   @Override
   public String toString() {
      return this.getRankStr() + " of " + this.getSuit();
   }

}
