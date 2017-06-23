package model.element.Motionless;

import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;
/**Motionlesselement
 * 
 * @author alexis
 *
 */
abstract class MotionlessElement extends Element {
	
	/**MotionlessElement
	 * 
	 * @param sprite
	 * @param permeability
	 */
	MotionlessElement(final Sprite sprite, final Permeability permeability) {
        super(sprite, permeability);
    }

}
