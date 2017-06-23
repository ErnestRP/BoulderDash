package model.element.Falling;

import model.element.Falling.FallingElement;
import model.element.Falling.Rock;
import model.element.Falling.Diamond;

/**
 * <h1>The Class FallingElementFactory.</h1>
 * 
 */
public class FallingElementFactory {
	
		/**The Rock. */
		private static final Rock		ROCK     =  new Rock();
		
		/**The Diamond */
		private static final Diamond	DIAMOND	 =  new Diamond();
		
		/** Instantiate new falling elements */
		private static FallingElement[] fallingElements = { ROCK, DIAMOND };
		
		/** createRock
		 * 
		 * @return
		 */
		public static FallingElement createRock(){
			return ROCK;
		}
		
		/** Create a new Diamond
		 * 
		 * @return
		 */
		public static FallingElement createDiamond(){
			return DIAMOND;
		}
		
		/** getFromFileSymbol
		 * 
		 * @param fileSymbol
		 * @return
		 */
		public static FallingElement getFromFileSymbol(final char fileSymbol) {
	        for (final FallingElement fallingElement : fallingElements) {
	            if (fallingElement.getSprite().getConsoleImage() == fileSymbol) {
	                return fallingElement;
	            }
	        }
			return null;
		}
}
