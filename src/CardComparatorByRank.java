/**
 * 
 * Implements a Comparator to compare two cards by their rank
 *
 * @author Justin Huynh
 */ 
import java.util.Comparator;
 
public class CardComparatorByRank implements Comparator<Card> {
  /*
   * Compares two cards by their rank
   */
   public int compare(Card card1, Card card2) {
         return card1.getRank() - card2.getRank();
   }
   
}
