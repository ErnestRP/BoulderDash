package model.element.Motionless;

import model.element.Permeability;
import model.element.Sprite;
/**exit
 * 
 * @author alexis
 *
 */
 class exit extends MotionlessElement {
	/**SPRITE
	 * 
	 */
	 private final static Sprite SPRITE = new Sprite ('4', "exit.jpg");
	/**exit
	 * instantiate new sprite with his permeability
	 */
	 public exit(){
		super( SPRITE, Permeability.EXIT);
	}
}
