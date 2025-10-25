import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DeckTest {
      
	@Test
	public void testDefaultDeckConstructor() {
		Deck deck = new Deck();
		assertEquals(51, deck.getTopCard());
	}
   
	@Test
	public void testCopyConstructor() {
		Deck original = new Deck();
		Deck copy = new Deck(original);
		assertEquals(original.toString(), copy.toString());
	}

	@Test
	public void testDealSuccess() {
		Deck deck = new Deck();
		Deck[] hands = deck.deal(4, 5);
		assertNotNull(hands);
		assertEquals(4, hands.length);
		for (Deck hand : hands) {
			assertEquals(4, hand.getTopCard()); 
		}
	}
   
   @Test
   public void testShufffle() {
      Deck deck1 = new Deck(true);
      Deck deck2 = new Deck(true);
      deck2.shuffle();
      assertNotEquals(deck1, deck2);
   }
      
   @Test
   public void testEquals() {
      Deck deck1 = new Deck();
      Deck deck2 = new Deck(deck1);
      assertEquals(deck1, deck2);
   }
   
   @Test
   public void testPick() {
      Deck deck = new Deck();
      int a = deck.getTopCard();
      Card card = deck.pick();
      int b = deck.getTopCard();
      assertNotEquals(a, b);
   }
   
   @Test
   public void testSelectionSort() {
      Deck deck = new Deck(false);
      Deck deck2 = new Deck(true);
      deck.selectionSort();
      assertEquals(deck, deck2);
   }
   
   @Test
   public void testMergeSort() {
      Deck deck = new Deck(false);
      Deck deck2 = new Deck(true);
      deck.mergeSort();
      assertEquals(deck, deck2);
   }
   
}
