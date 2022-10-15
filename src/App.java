/**
 * 
 * @author Iroda Narzullaeva
 * 
 * Driver class for the game
 *
 */
public class App {

	public static void main(String[] args) {
		
		Deck newDeck = new Deck();
		Player player1 = new Player();
		Player player2 = new Player();
		Card drawnCard1;
		Card drawnCard2;
		int round = 1;
		final int DECK_SIZE = 52;
		final int HAND_SIZE = 26;
		
		//shuffle the deck
		newDeck.shuffle();
		
		//set players' names
		player1.setName("Mary");
		player2.setName("John");
		
		//deal cards to each player. Each player gets 26 cards
		for (int i = 0; i < DECK_SIZE; i++)
		{
			if (i % 2 == 0)
			{
				player1.draw(newDeck);
			}
			else 
			{
				player2.draw(newDeck);
			}	
		}
		
		//draw a card from each player's hand and compare the drawn cards. If first payer's card 
		//is greater than second player's card, first player gets a point and vice versa. 
		//Print the flipped card and player's score each round
		for (int i = 0; i < HAND_SIZE; i++) {
			
			//print the round number 
			System.out.println("Round " + round);
			
			//print card that each player flips
			drawnCard1 = player1.flip();
			System.out.print(player1.getName() + "'s card: ");
			drawnCard1.describe();
			drawnCard2 = player2.flip();
			System.out.print(player2.getName() + "'s card: ");
			drawnCard2.describe();
			
			//determine if a player gets a point and  which player gets it
			if (drawnCard1.getValue() > drawnCard2.getValue())
			{
				player1.incrementScore();
				System.out.println(player1.getName() + " gets a point! This player's score is " + player1.getScore());
			}
			else if (drawnCard1.getValue() < drawnCard2.getValue())
			{
				player2.incrementScore();
				System.out.println(player2.getName() + " gets a point! This player's socre is " + player2.getScore());
			}
			else 
			{
				System.out.println("It's a tie this round!");
			}
			
			System.out.print("\n");
			round++;	
		}
		
		//print the final score of each player
		System.out.println(player1.getName() + "'s final score is " + player1.getScore());
		System.out.println(player2.getName() + "'s final score is " + player2.getScore());
		
		//compare players' scores and determine the winner or if is a draw
		if (player1.getScore() > player2.getScore())
		{
			System.out.println("Player 1 " + player1.getName() + " is the winner!");
		}
		else if (player1.getScore() < player2.getScore())
		{
			System.out.println("Player 2 " + player2.getName() + " is the winner!");
		}
		else 
		{
			System.out.println("It's a Draw!");
		}
	} //end main
} //end App class
