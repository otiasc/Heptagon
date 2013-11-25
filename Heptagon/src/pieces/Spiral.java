package pieces;
/**
 * 
 * A spiral made by a sequence of pieces
 * 
 */
public class Spiral extends Pattern {
	/**
	 * Constructor.
	 * @param mainPiece  The piece that is repeated along the spiral
	 * @param distance   The radial distance between a piece and the next 
	 * @param amount     The amount of pieces in the spiral
	 * 
	 * @throws Exception  If the distance is less than the piece width
	 */
	public Spiral(Piece mainPiece, double distance, int amount) {
		this.sides = Pattern.defaultSides;
		this.startPosition = Pattern.defaultStartPosition;
		
		this.pieces = new Piece[amount];
		
		int i = 0;
		while (i<amount) {
			int l = (mainPiece.lane + i) % this.sides;
			double d = this.startPosition + distance * i/this.sides;
			double w = mainPiece.width;
			
			Piece newPiece = new Piece(l, d, w);
			this.pieces[i] = newPiece;
			i++;
		}
	}
	
	public String toString() {
		return "Spiral object with " + pieces.length + " pieces";
	}
	
}
