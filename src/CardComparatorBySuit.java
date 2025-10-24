/**
 * Justin Huynh
 * CS 876 
 * Assignment 2
 * 10/24/25
 */
 
import java.util.Comparator;
 
public class CardComparatorBySuit implements Comparator<Card> {

   public int compare(Card card1, Card card2) {
         return card1.getSuitInt() - card2.getSuitInt();
   }

}
