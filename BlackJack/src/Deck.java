import java.util.ArrayList;
import java.util.Collections;

public class Deck
	{
			
				public static ArrayList <Card> deck = new ArrayList <Card>();
						
						public static void fillDeck()
						{
							deck.add(new Card ("ace", "hearts", 14));
							deck.add(new Card ("two", "hearts", 2));
							deck.add(new Card ("three", "hearts", 3));
							deck.add(new Card ("four", "hearts", 4));
							deck.add(new Card ("five", "hearts", 5));
							deck.add(new Card ("six", "hearts", 6));
							deck.add(new Card ("seven", "hearts", 7));
							deck.add(new Card ("eight", "hearts", 8));
							deck.add(new Card ("nine", "heart", 9));
							deck.add(new Card ("ten", "hearts", 10));
							deck.add(new Card ("Jack", "heart", 10));
							deck.add(new Card ("Queen", "hearts", 10));
							deck.add(new Card ("king", "hearts", 10));
							deck.add(new Card ("ace", "diamonds", 11));
							deck.add(new Card("two", "diamonds", 2));
							deck.add(new Card("three", "diamonds", 3));
							deck.add(new Card("four", "diamonds", 4));
							deck.add(new Card("five", "diamonds", 5));
							deck.add(new Card("six", "diamonds", 6));
							deck.add(new Card("seven", "diamonds", 7));
							deck.add(new Card("eight", "diamonds", 8));
							deck.add(new Card("nine", "diamonds", 9));
							deck.add(new Card("ten", "diamonds", 10));
							deck.add(new Card("Jack", "diamonds", 10));
							deck.add(new Card("Queen", "diamonds", 10));
							deck.add(new Card("King", "diamonds", 10));
							deck.add(new Card ("ace", "spades", 11));
							deck.add(new Card ("two", "spades", 2));
							deck.add(new Card ("three", "spades", 3));
							deck.add(new Card ("four", "spades", 4));			
							deck.add(new Card ("five", "spades", 5));
							deck.add(new Card ("six", "spades", 6));
							deck.add(new Card ("seven", "spades", 7));
							deck.add(new Card ("eight", "spades", 8));
							deck.add(new Card ("nine", "spades", 9));
							deck.add(new Card ("ten", "spades", 10));
							deck.add(new Card ("Jack", "spades", 10));
							deck.add(new Card ("Queen", "spades", 10));
							deck.add(new Card ("King", "spades", 10));
							deck.add(new Card ("ace", "clubs", 11));
							deck.add(new Card ("two", "clubs", 2));
							deck.add(new Card ("three", "clubs", 3));
							deck.add(new Card ("four", "clubs", 4));
							deck.add(new Card ("five", "clubs", 5));
							deck.add(new Card ("six", "clubs", 6));
							deck.add(new Card ("seven", "clubs", 7));
							deck.add(new Card ("eight", "clubs", 8));
							deck.add(new Card ("nine", "clubs", 9));
							deck.add(new Card ("ten", "clubs", 10));
							deck.add(new Card ("jack", "clubs", 10));
							deck.add(new Card ("queen", "clubs", 10));
							deck.add(new Card ("King", "clubs", 10));
							
							
							
							
							
							
							
							
						}
						public static void shuffleDeck()
							{
								Collections.shuffle(deck);
							}
						
						public static ArrayList<Card> getDeck()
							{
								return deck;
							}
						public static void setDeck(ArrayList<Card> deck)
							{
								Deck.deck = deck;
							}
	}
