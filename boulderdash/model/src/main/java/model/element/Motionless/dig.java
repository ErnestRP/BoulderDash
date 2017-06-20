package model.element.Motionless;

import model.element.Permeability;
import model.element.Sprite;

class dig extends MotionlessElement {
	
	private final static Sprite SPRITE = new Sprite ('2', "dig.jpg");
	
	dig(){
		super(SPRITE, Permeability.PENETRABLE);
	}
}
