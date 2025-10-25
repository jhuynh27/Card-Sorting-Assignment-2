import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CardComparatorBySuitTest {

  /*
   * Tests compare method with two cards with the same rank and different suit
   * Should return less than 0
   */
   @Test
   public void testCompareToDifferentSuits() {
      Card card1 = new Card("Diamonds", "Six");
      Card card2 = new Card("Spades", "Six");
      CardComparatorByRank comparator = new CardComparatorByRank();
      assertTrue(card1.compareTo(card2) < 0);
   }

}
