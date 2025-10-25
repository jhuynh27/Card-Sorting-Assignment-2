import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CardTest {
    
    @Test
    public void testDefaultConstructor() {
      Card card = new Card();
      assertNotNull(card);
    }
    
    @Test
    public void testStringtoStringConstructor() {
      Card card = new Card("Spades", "Two");
      assertEquals("Spades", card.getSuitInt());
      assertEquals(3, card.getRank());
    }
    
    @Test
    
    public void testIntToIntConstructor() {
      Card card = new Card(2, 12);
      assertEquals("Hearts", card.getSuit());
      assertEquals(12, card.getRank());
    }
    
    @test
    public void testIntToStringConstructor() {
      Card card = new Card(1, "Jack");
      assertEquals("Diamonds", card.getSuit());
      assertEquals("Jack", card.getRank());
    }
    
    @Test
    public void testStringToIntConstructor() {
      Card card = new Card("Clubs", 4);
      assertEquals("Clubs", card.getSuit());
      assertEquals(4, card.getRank());
    }
    
    @Test
    public void testCopyConstructor() {
      Card original = new Card(3, 9);
      Card copy = new Card(original);
      assertEquals(original, copy);
      assertNotSame(original, copy);
    }
    
    @Test
    public void testToString() {
      Card card = new Card("Hearts", "King");
      assertEquals("King of Hearts", card.toString());
    }
    
    @Test
    public void testGetStringSuit() {
      Card card = new Card("Clubs", "Ace");
      assertEquals("Clubs", card.getSuit());
    }
    
    @Test
    public void testGetIntRank() {
      Card card = new Card("Spades", "Ace");
      assertEquals(1, card.getRank());
    }
      
    @Test
    public void testGetSuitInt() {
        Card card = new Card("Clubs", 3);
        assertEquals(0, card.getSuitInt());
    }

    @Test
    public void testGetRankStr() {
        Card card = new Card("Diamonds", 1); 
        assertEquals("Ace", card.getRankStr());
    }
    
    @Test
    public void testCompareToSameCard() {
      Card card1 = new Card("Hearts", "Queen");
      Card card2 = new Card("Hearts", "Queen");
      assertEquals(0, card1.compareTo(card2));
    }
    
    @Test
    public void testCompareToDifferentSuits() {
      Card card1 = new Card("Hearts", "Queen");
      Card card2 = new Card("Spades", "Queen");
      assertEquals(card1.compareTo(card2) < 0);
    }
    
    @Test
    public void testCompareToDifferentRanks() {
      Card card1 = new Card("Spades", "Six");
      Card card2 = new Card("Spades", "Seven");
      assertEquals(card1.compareTo(card2) < 0);
    }
    
    @Test
    public void testEquals() {
      Card card1 = new Card("Clubs", "Ten");
      Card card2 = new Card("Clubs", "Ten");
      assertEquals(card1, card2);
    }
    
    @Test
    public void testNotEquals() {
      Card card1 = new Card("Clubs", "Ten");
      Card card2 = new Card("Hearts", "Ten");
      assertNotEquals(card1, card2);
    }
}