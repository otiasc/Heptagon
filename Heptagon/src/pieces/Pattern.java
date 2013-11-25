package pieces;
/**
 * 
 * A collection of pieces that defines a single structure
 *
 */
public class Pattern {
	/**
	 * Number of sides of the base polygon of the default pattern.
	 */
	public static int defaultSides = 7;
	public static double defaultStartPosition = 0;
	/**
	 * Number of sides of the base polygon of this pattern
	 */
	public int sides = 0;
	public Piece[] pieces;
	/**
	 * Distance from the absolute 0 to the beginning of the pattern
	 */
	double startPosition;
	/**
	 * Default constructor.
	 * 
	 */
	Pattern() {
		this.sides = Pattern.defaultSides;
	}
	
	/**
	 * Change the number of sides of the base polygon
	 * @param sides  new number of sides
	 */
	public void setSides(int sides) {
		if (sides>0) {
			this.sides = sides;
		}
	}
	
	/**
	 * 
	 */
	public String toString() {
		return this.getClass().getSimpleName() + " object with " + pieces.length + " pieces";
	}
}
