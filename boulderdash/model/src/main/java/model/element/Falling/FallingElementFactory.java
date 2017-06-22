package model.element.Falling;

import model.element.Falling.FallingElement;
import model.element.Falling.Rock;
import model.element.Falling.Diamond;

public class FallingElementFactory {
	
		
		private static final Rock		ROCK     =  new Rock();
		
		private static final Diamond	DIAMOND	 =  new Diamond();
		
		
		private static FallingElement[] fallingElements = { ROCK, DIAMOND };
		
		
		public static FallingElement createBlock(){
			return ROCK;
		}
		
		public static FallingElement createDig(){
			return DIAMOND;
		}
		
		
		public static FallingElement getFromFileSymbol(final char fileSymbol) {
	        for (final FallingElement fallingElement : fallingElements) {
	            if (fallingElement.getSprite().getConsoleImage() == fileSymbol) {
	                return fallingElement;
	            }
	        }
			return null;
		}
}
