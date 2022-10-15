/**
 * 
 * @author Iroda Narzullaeva
 * 
 * This class creates cards and prints out information about a card.
 *
 */
public class Card {
	private int value;    								//value of the card 2-Ace
	private StringBuilder name = new StringBuilder();   //card name
	
	/**
	 * constructor for Class Card
	 * @param value
	 * @param suit
	 */
	public Card (int value, String suit) {
		this.value = value; 
		
		switch (value) 
		{
		case 2: name.append("Two");
		break;
		case 3: name.append("Three");
		break;
		case 4: name.append("Four");
		break;
		case 5: name.append("Five");
		break;
		case 6: name.append("Six");
		break;
		case 7: name.append("Seven");
		break;
		case 8: name.append("Eight");
		break;
		case 9: name.append("Nine");
		break;
		case 10: name.append("Ten");
		break;
		case 11: name.append("Jack");
		break;
		case 12: name.append("Queen");
		break;
		case 13: name.append("King");
		break;
		case 14: name.append("Ace");
		break;
		default: 
			System.out.println("Undefined");
		} //end switch
		
		//build card name that will be displayed for user
		name.append(" of " + suit);
	} //end Card constructor

	/**
	 * retrieves the face value of the card
	 */
	public int getValue() {
		return value;
	} //end getValue method
	
	/**
	 * sets the face value of the card
	 * @param value
	 */
	public void setValue(int value) {
		this.value = value;
	} //end setValue method
	
	/**
	 * retrieves the name of the card
	 */
	public StringBuilder getName() {
		return name;
	} //end getName method
	
	/**
	 * sets the name of the card
	 * @param name
	 */
	public void setName(StringBuilder name) {
		this.name = name;
	} //end setName method
	
	/**
	 * prints information about the card
	 */
	public void describe () {
		System.out.println(name + ", ");
	} //end describe method
	
	/**
	 * convert StringBuilder into String to print card information
	 * StringBuilder is printing addresses instead of values without overriding
	 * overriding toString method 
	 */
	public String toString() {
        return "[" + name + "," + "]";
	} //end toString method

} //end Card class
