/**
 * 
 * Implements a Comparator to compare two cards by their suit 
 * 
 * @author Justin Huynh
 */
 
import java.util.Comparator;
 
public class CardComparatorBySuit implements Comparator<Card> {
  /*
   * Compares two cards by their suit
   */
   public int compare(Card card1, Card card2) {
         return card1.getSuitInt() - card2.getSuitInt();
   }

}
