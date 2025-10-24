/**
 * Justin Huynh
 * CS 876 
 * Assignment 2
 * 10/24/25
 * 
 * This class represents a Card object. 
 */
 
public class Card implements Comparable<Card> {

   private int suit;    // clubs - 0, diamonds - 1, hearts - 2, spades - 3
   private int rank;    // Ace – 1, 2-10 their numerical value, 11 – Jack, 12 – Queen, 13 – King
   
   public Card() {
      suit = 0;
      rank = 1;
   }
   
   public Card(int suit, int rank) {
      this.suit = suit;
      this.rank = rank;
   }
   
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
   
   public Card(Card c) {
      this.suit = c.getSuitInt();
      this.rank = c.getRank();
   }
   
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
   
   public int getRank() {
      return rank;
   }
   
   public int getSuitInt() {
      return this.suit;
   }
   
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
   
   public int compareTo(Card other) {
      if (this.suit != other.getSuitInt()) {
         return this.suit - other.getSuitInt();
      }
      return this.rank - other.getRank();
   }
   
   @Override
   public boolean equals(Object other) {
           
      Card otherCard = (Card) other;
      return this.suit == otherCard.getSuitInt() && this.rank == otherCard.getRank();
         
   }
   
   @Override
   public String toString() {
      return this.getRankStr() + " of " + this.getSuit();
   }

}
