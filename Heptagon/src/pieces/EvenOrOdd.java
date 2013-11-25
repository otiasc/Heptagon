package pieces;

import exceptions.PieceException;

/**
 * 
 * A all-even or all-odd pieces in a line
 *
 */
public class EvenOrOdd extends Pattern {
	/**
	 *  
	 * @param mainPiece  the piece that would be repeated
	 * @param even       A boolean.
	 *                   True if the Pattern covers the even places.
	 *                   False if odds.
	 * 
	 * @see Piece
	 *                   
	 * @throws Exception  if the number of sides of the sublevel is odd.
	 */

	public EvenOrOdd(Piece mainPiece, boolean even) throws PieceException {
		this.sides = Pattern.defaultSides;
		this.startPosition = Pattern.defaultStartPosition;
		
		if (this.sides%2==0) {
			this.pieces = new Piece[this.sides/2];
			for (int i=0; i<this.sides%2; i++) {
				if (even)
					this.pieces[i] = new Piece(i, mainPiece.distance, mainPiece.width);
				else 
					this.pieces[i] = new Piece(i+1, mainPiece.distance, mainPiece.width);
			}
		} else {
			// Throw an Exception > "Number of pieces must be even"
			throw new PieceException(PieceException.EVEN_OR_ODD_PIECE_CONSTRUCTION_ERROR, "Number of pieces must be even");
			// throw();
		}
	}
}
