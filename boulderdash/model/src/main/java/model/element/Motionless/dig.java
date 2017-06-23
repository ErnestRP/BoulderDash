package model.element.Motionless;

import model.element.Permeability;
import model.element.Sprite;
/** dig
 * 
 * @author alexis
 *
 */
class dig extends MotionlessElement {
	/**SPRITE
	 * 
	 */
	private final static Sprite SPRITE = new Sprite ('2', "dig.jpg");
	/**dig
	 * instantiate new sprite with his permeability
	 */
	dig(){
		super(SPRITE, Permeability.PENETRABLE);
	}
}
