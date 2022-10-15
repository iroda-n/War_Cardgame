import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 
 * @author Iroda Narzullaeva
 * 
 * This class creates a deck of cards and shuffles them. 
 * It also provides a method that draws a card from the deck
 *
 */
public class Deck {
	
	List<Card> cards = new ArrayList<Card>();
	String[] suit = {"Clubs", "Diamonds", "Spades", "Hearts"};
	private final int SIZE = 52;
	
	/**
	 * constructor for Class Deck - creates a deck of 52 cards
	 */
	public Deck() {
		for (int i = 2; i < 15; i++) 
		{
			for (int j = 0; j < suit.length; j++) 
			{
				cards.add(new Card(i, suit[j]));
			}
		}
	} //end Deck constructor
	
	//shuffle a deck of cards
	/**
	 * shuffle the deck of cards
	 */
	public void shuffle () {
		Random rand = new Random();
		for (int i = 0; i < SIZE; i++)
		{
			int j = i + rand.nextInt(SIZE - i);
			Collections.swap(cards, i, j);
		}
		//Collections.shuffle(cards);
	} //end shuffle method
	
	/**
	 * Remove and return the top card of the deck 
	 * @return Card
	 */
	public Card draw()
	{
		Card drawnCard = cards.get(0);
		cards.remove(drawnCard);
		return drawnCard;
	} //end draw method
	
	/**
	 * Print contents of the deck, for testing only
	 */
	public void printDeck() {
		for (int i = 0; i < cards.size(); i++)
		{
			System.out.println(cards.get(i));
		}
	} //end printDeck method
	
	public int deckSize () {
		return cards.size();
	}
} //end Deck class
