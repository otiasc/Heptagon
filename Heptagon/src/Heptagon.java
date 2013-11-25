import exceptions.PieceException;
import pieces.*;

/**
 * 
 * Game Heptagon. Includes everything
 * 
 */
public class Heptagon {
	public static void log(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		/*
		 * Trials of object creation
		 */
		Heptagon.log("---- TEST ZONE ----");
		Piece test1 = new Piece(0, 0, 3);
		Heptagon.log("test1>\t" + test1.toString());
		
		Spiral test2 = new Spiral(test1, 7, 20);
		Heptagon.log("test2>\t" + test2.toString());
		Heptagon.log("test2.pieces[1]>\t" + test2.pieces[1].toString());
		Heptagon.log("test2.pieces[2]>\t" + test2.pieces[2].toString());
		Heptagon.log("test2.pieces[3]>\t" + test2.pieces[3].toString());
		Heptagon.log("test2.pieces[10]>\t" + test2.pieces[10].toString());
		Heptagon.log("test2.pieces[17]>\t" + test2.pieces[17].toString());
		
		
		EvenOrOdd test3 = null;
		try {
			test3 = new EvenOrOdd(test1, false);
			
			Heptagon.log("test3>\t" + test3.toString());
		} catch (PieceException e) {
			Heptagon.log("test3>\t" + e.getMessage());
		}
		
		
		Pattern.defaultSides = 8;
		Heptagon.log("> Number of defaultSides changed to 8");
		
		EvenOrOdd test4 = null;
		try {
			test4 = new EvenOrOdd(test1, false);
			
			Heptagon.log("test4>\t" + test4.toString());
		} catch (PieceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Heptagon.log("---- END TEST ----");
	}

}
