package model.element.Motionless;

import model.element.Permeability;
import model.element.Sprite;
/**mud
 * 
 * @author alexis
 *
 */
class mud extends MotionlessElement {
	
	/**SPRITE
	 * 
	 */
	private final static Sprite SPRITE = new Sprite ('1', "mud.jpg");
	/**mud
	 * instantiate new sprite with his permeability
	 */
	mud(){
		super( SPRITE, Permeability.DESTROY);
	}
}

