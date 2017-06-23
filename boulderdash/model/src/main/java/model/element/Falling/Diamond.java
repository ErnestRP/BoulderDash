package model.element.Falling;

import model.element.Permeability;
import model.element.Sprite;
/**Dimond
 * 
 * @author Alexis
 *
 */
 class Diamond extends FallingElement {
	/**SPRITE
	 * 	
	 */
	private final static Sprite SPRITE = new Sprite('1', "Diamond.jpg");
	/**Diamond
	 * 	
	 */
	Diamond(){
		super(SPRITE, Permeability.PUSH);
		}

}
