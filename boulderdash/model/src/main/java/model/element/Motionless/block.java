package model.element.Motionless;

import model.element.Permeability;
import model.element.Sprite;
/**block
 * 
 * @author user
 *
 */
class block extends MotionlessElement {
	/**SPRITE
	 * 
	 */
	private final static Sprite SPRITE = new Sprite ('5', "Block.jpg");
	/**block
	 * instantiate new sprite with his permeability
	 */
	block(){
		super(SPRITE, Permeability.BLOCKING);
	}
}
