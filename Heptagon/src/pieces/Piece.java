package pieces;
/**
 * 
 * A piece that the user has to avoid
 * 
 */
public class Piece {
	
	public int lane;
	public double distance;
	public double width;

	/**
	 * Creates a new Piece object
	 * @param lane      states the lane of the map where the piece is.
	 * 
	 * @param distance  the distance from the center to the nearest vertex of the shape
	 * 
	 * @param width     the length of the non-parallel sides of the piece
	 */
	public Piece(int lane, double distance, double width) {
		this.lane = lane;
		this.distance = distance;
		this.width = width;
	}
	public String toString() {
		return "Piece of lane " + lane + ". " +
			    "Distance: " + distance + ". " +
			    "Width: " + width;
	}
}
