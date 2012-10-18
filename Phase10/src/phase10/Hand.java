/**
 * 
 */
package phase10;

import java.util.ArrayList;

/**
 * This class contains the cards in each player's hand
 * 
 * 
 * CS2003 Lab Project Fall 2012 <br />
 * Dr. Mailer <br />
 * Paul Harris, Matt Hruz, Evan Forbes
 * 
 * @author Evan Forbes
 * 
 */
public class Hand {

	private ArrayList<Card> cards;

	/**
	 * Creates an empty hand object, with no cards
	 */
	protected Hand() {

	}

	/**
	 * Adds a card to the hand
	 * 
	 * @param card
	 *            the card to add
	 */
	protected void addCard(Card card) {
		cards.add(card);
	}

	/**
	 * Removes a card from the hand
	 * 
	 * @param card
	 *            the card to remove
	 */
	protected void removeCard(Card card) {
		cards.remove(card);
	}

	/**
	 * @return the number of cards in the hand
	 */
	public int getNumberOfCards() {
		return cards.size();
	}

	/**
	 * Gets a card at the specified index
	 * 
	 * @param cardIndex
	 *            the index to get the card at
	 * @return the card, if it exists (null otherwise)
	 */
	public Card getCard(int cardIndex) {
		Card out = null;
		try {
			out = cards.get(cardIndex);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Invalid hand index: " + cardIndex);
		}
		return out;
	}

	/**
	 * Sorts the hand by color, then value
	 */
	public void sortByColor() {
		// TODO: not yet implemented
	}

	/**
	 * Sorts the hand by value, then color
	 */
	public void sortByValue() {
		// TODO: not yet implemented
	}
}
