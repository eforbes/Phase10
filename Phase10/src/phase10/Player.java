package phase10;

/**
 * This class contains all of the information for each player for the Phase 10
 * game.
 * 
 * 
 * CS2003 Lab Project Fall 2012 <br />
 * Dr. Mailer <br />
 * Paul Harris, Matt Hruz, Evan Forbes
 * 
 * @author Evan Forbes
 * 
 */
public class Player {

	private String name;
	private int score;
	private Card[] hand;
	private int phase;

	/**
	 * Creates the default player object with no name
	 */
	public Player() {
		name = "";
		score = 0;
		phase = 1;
	}

	/**
	 * Creates the player object with the given name
	 * 
	 * @param n
	 *            the player's name
	 */
	public Player(String n) {
		name = n;
		score = 0;
		phase = 1;
	}

	/**
	 * @return the player's name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param n
	 *            the name to set
	 */
	public void setName(String n) {
		name = n;
	}

	/**
	 * @return the player's score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param points
	 *            the points to add to this player's score
	 */
	public void addToScore(int points) {
		score += points;
	}

	/**
	 * @return the phase the player is currently on
	 */
	public int getPhase() {
		return phase;
	}

	/**
	 * Increment the player's phase by 1
	 */
	public void incrementPhase() {
		phase++;
	}

	/**
	 * @return the player's hand
	 */
	public Card[] getHand() {
		return hand;
	}

	/**
	 * @return the number of cards in this player's hand
	 */
	public int getHandSize() {
		return hand.length;
	}

}
