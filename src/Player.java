import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Iroda Narzullaeva
 * 
 * This class creates a player and builds a hand for them. 
 * It also keeps track of the score and prints out information about player's hand.
 *
 */
public class Player {
	List <Card> hand = new ArrayList<Card> ();
	private int score;
	private String name;
	//private final int HAND_SIZE = 26;
	
	/**
	 * constructor for Class Player
	 */
	public Player () {
		score = 0;
	} //end Player constructor
	
	/**
	 * 
	 * @return score
	 * Retrieve player's score
	 */
	public int getScore() {
		return score;
	} //end getScore method
	
	/**
	 * 
	 * @return name
	 * Return player's name
	 */
	public String getName() {
		return name;
	} //end getName method

	/**
	 * 
	 * @param name
	 * Sets player's name
	 */
	public void setName(String name) {
		this.name = name;
	} //end setName method
	
	/**
	 * Print player's name and hand.
	 * Print new line afterwards for better formatting 
	 */
	public void describe() {
		System.out.println("Player " + name + "'s hand: ");
		for (Card card: hand)
		{
			card.describe();
		}
		System.out.print("\n");
	} //end describe method
	
	/**
	 * Remove and return the top card from the hand
	 * @return Card
	 */
	public Card flip () {
		return hand.remove(0);
	} //end flip method
	
	/**
	 * Add cards from the deck to the player's hand
	 * @param deck
	 */
	public void draw (Deck deck) {
		hand.add(deck.draw());
	} //end draw method
	
	/**
	 * Increment player's score by one 
	 */
	public void incrementScore() {
		score++;
	} //end incrementScore method
} //end Player class
