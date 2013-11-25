package exceptions;

public class PieceException extends Exception {
	private static final long serialVersionUID = 466445687449961121L;
	
	public static final String PIECE_CONSTRUCTION_ERROR = "Piece Construction Error";
	public static final String EVEN_OR_ODD_PIECE_CONSTRUCTION_ERROR = "Error Constructing EvenOrOdd Object. Number of sides of the polygon must be even.";
	
	private String errorCode = "";
	
	public PieceException(String message, String errorCode) {
		super(message);
		this.errorCode = errorCode;
	}
	
	public String getErrorCode() {
		return this.errorCode;
	}
}
