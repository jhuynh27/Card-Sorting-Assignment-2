import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CardComparatorByRankTest {
  /*
   * Tests compare method with two cards with the same suit and different rank
   * Should be less than 0
   */
	@Test
	public void testCompareToDifferentRanks() {
      Card card1 = new Card("Spades", "Six");
      Card card2 = new Card("Spades", "Seven");
      CardComparatorByRank comparator = new CardComparatorByRank();
      assertTrue(card1.compareTo(card2) < 0);
   }
}
