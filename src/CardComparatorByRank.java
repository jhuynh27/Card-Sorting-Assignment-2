/**
 * Justin Huynh
 * CS 876 
 * Assignment 2
 * 10/24/25
 */
 
import java.util.Comparator;
 
public class CardComparatorByRank implements Comparator<Card> {

   public int compare(Card card1, Card card2) {
         return card1.getRank() - card2.getRank();
   }
   
}
