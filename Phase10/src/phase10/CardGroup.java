package phase10;

/**
 * This class contains all of the information for each "laid down" phase, and
 * validates
 * 
 * CS2003 Lab Project Fall 2012 <br />
 * Dr. Mailer <br />
 * Paul Harris, Matt Hruz, Evan Forbes
 * 
 * @author Evan Forbes
 * 
 */
public class CardGroup {

	private Card[] cards;
	private int type;
	private int owner;

	/**
	 * Creates a new card group
	 * 
	 * @param t
	 *            the type of card group (0: run, 1: all one color, 2: set)
	 * @param player
	 *            the player who created this card group
	 * @param c
	 *            the initial cards in this group
	 */

	public CardGroup(int t, int player, Card... c) {
		type = t;
		owner = player;
		cards = c;
	}

	/**
	 * Check to see if the newly constructed card group is valid
	 * 
	 * @return true if it is valid, false otherwise
	 */
	public boolean isValid() {
		// TODO: not yet implemented
		return false;
	}

	/**
	 * Attempts to add a card to the already created card group. (Any player can
	 * add to any group)
	 * 
	 * @return true if the card was valid and added, false if it does not fit in
	 *         the group and was not added
	 */
	public boolean addCard(Card c) {
		// TODO: not yet implemented

		return false;
	}

	/**
	 * @return the cards
	 */
	public Card[] getCards() {
		return cards;
	}

	/**
	 * @return the type of card group (0: run, 1: all one color, 2: set)
	 */
	public int getType() {
		return type;
	}

	/**
	 * @return the player number of who put down this card group
	 */
	public int getOwner() {
		return owner;
	}

}
