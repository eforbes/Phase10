package phase10;

/**
 * This class contains all of the information for each playing card for the
 * Phase 10 game.
 * 
 * 
 * CS2003 Lab Project Fall 2012 <br />
 * Dr. Mailer <br />
 * Paul Harris, Matt Hruz, Evan Forbes
 * 
 * @author Evan Forbes
 * 
 */
public class Card {

	private int color;
	private int value;
	private int id;

	/**
	 * 
	 * @param c
	 *            the color (0 through 3)
	 * @param v
	 *            the value (1 through 12, wild = 13, skip = 14)
	 * @param i
	 *            the unique id of this card
	 */
	public Card(int c, int v, int i) {
		color = c;
		value = v;
		id = i;
	}

	/**
	 * @return the color
	 */
	public int getColor() {
		return color;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

}
