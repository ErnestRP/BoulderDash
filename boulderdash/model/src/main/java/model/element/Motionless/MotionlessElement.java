package model.element.Motionless;

import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;

abstract class MotionlessElement extends Element {
	
	
	MotionlessElement(final Sprite sprite, final Permeability permeability) {
        super(sprite, permeability);
    }

}
