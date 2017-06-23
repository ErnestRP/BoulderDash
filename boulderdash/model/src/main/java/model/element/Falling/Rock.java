package model.element.Falling;

import model.element.Permeability;
import model.element.Sprite;
/**
 * <h1>The Class Rock.</h1>
 * 
 */
public class Rock extends FallingElement {
	/**SPRITE
	 * 
	 */
	private final static Sprite SPRITE = new Sprite('1', "Rock.jpg");
	/** Rock
	 * 
	 */
	Rock(){
		super(SPRITE, Permeability.PUSH);
	}
}
